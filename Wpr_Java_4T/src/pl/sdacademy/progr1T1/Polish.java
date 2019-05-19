package pl.sdacademy.progr1T1;

public class Polish extends Person {


    private String nationality;
    private int noChildren;
    private int pesel;



    public Polish(String firstName, String lastName, Sex sex, int age, int pesel,
                  String nationality, int noChildren) {
        super(firstName, lastName, sex, age);
        this.nationality = nationality;
        this.noChildren = noChildren;
        this.pesel = pesel;
    }

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
        return super.toString() + "\nPesel: " + pesel+ "\nNationality: " + nationality + "\nNumber of children: "
                + noChildren + "\nKarta duzej rodziny: " + enabledKDR();
    }

    public int getPesel() {
        return pesel;
    }
}
