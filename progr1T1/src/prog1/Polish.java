package prog1;

import java.util.Objects;

public class Polish extends Person {


    private String nationality;
    private int noChildren;
    private int pesel;


    private static int instanceNumber = 0;

    {// block inicjujacy , wykonuje sie przy tworzeniu kazdego obiektu
        System.out.println("init");
        instanceNumber++;
    }


    public Polish(String firstName, String lastName, Sex sex, int age, int pesel,
                  int noChildren) {
        super(firstName, lastName, sex, age);
        System.out.println("contsr");

        this.nationality = "Polish";
        this.noChildren = noChildren;
        this.pesel = pesel;
    }

    public Polish(String firstName, String lastName, int age, int noChildren, int pesel) {
        super(firstName, lastName, age);
        System.out.println("contsr");

        this.nationality = "Polish";
        this.noChildren = noChildren;
        this.pesel = pesel;
    }

    @Override
    public boolean isRetired() {
        if (getSex() == Sex.MAN && getAge() > 65 || getSex() == Sex.WOMAN && (getAge() > 60)) {
            return true;
        }
        return false;
    }

    public boolean enabledKDR() {
        return noChildren >= 3;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPesel: " + pesel + "\nNationality: " + nationality + "\nNumber of children: "
                + noChildren + "\nKarta duzej rodziny: " + enabledKDR();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPesel() + getFirstName() + getLastName());
    }

    // Objects to klasa pomocnicza ze statycznymi metodami

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } // sprawdza czy to jest ten sam obiekt
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        } // czy jest ta sama klasa
        Polish polishObj = (Polish) obj;
        String name = polishObj.getFirstName() + polishObj.getLastName();
        String thisName = this.getFirstName() + this.getLastName();

        return Objects.equals(polishObj.getPesel(), this.getPesel()) && (Objects.equals(this.getFirstName() + this.getLastName(),
                polishObj.getFirstName() + polishObj.getLastName()));


    }

    public int getPesel() {
        return pesel;
    }

    @Override
    public int getIdentity() {
        return pesel;
    }

    public static int getInstanceNumber() {
        return instanceNumber;
    }

    @Override
    public boolean canDriveCar() {
        return getAge() > 16 && hasDrivingLicence();
    }

    @Override
    public boolean canRace() {
        return getAge() > 10;
    }
}
