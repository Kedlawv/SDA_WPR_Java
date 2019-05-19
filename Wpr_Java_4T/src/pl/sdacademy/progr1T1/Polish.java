package pl.sdacademy.progr1T1;

public class Polish extends Person {


    public Polish(String firstName, String lastName, Sex sex, int age,
                  String nationality, int noChildren) {
        super(firstName, lastName, sex, age);
        this.nationality = nationality;
        this.noChildren = noChildren;
    }

    private String nationality;
    private int noChildren;

    @Override
    public boolean isRetired() {
        if(getSex() == Sex.MAN && getAge() > 65 || getSex()==Sex.WOMAN && (getAge() > 60)){
            return true;
        }
        return false;
    }

    public boolean enabledKDR(){
        return noChildren >= 3;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNationality: " + nationality + "\nNumber of children: "
                + noChildren + "\nKarta duzej rodziny: " + enabledKDR();
    }
}
