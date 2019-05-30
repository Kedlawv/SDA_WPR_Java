package prog1;

public class English extends Person {

    private String nationality;
    private int noChildren;
    private int taxNumber;
    private boolean hasGuardian;

    {
        this.nationality = "English";
        this.hasGuardian = false;

    }

    public English(String firstName, String lastName, Sex sex, int age,
                   int noChildren, int taxNumber) {
        super(firstName, lastName, sex, age);
        this.noChildren = noChildren;
        this.taxNumber = taxNumber;

    }

    @Override
    public int getIdentity() {
        return taxNumber;
    }

    @Override
    public boolean canDriveCar() {
        return (getAge() > 16 && hasDrivingLicence()) || (getAge() > 14 && hasGuardian);
    }

    @Override
    public boolean canRace() {
        return getAge() > 12;
    }

    public boolean hasGuardian() {
        return hasGuardian;
    }

    public void setHasGuardian(boolean hasGuardian) {
        this.hasGuardian = hasGuardian;
    }
}
