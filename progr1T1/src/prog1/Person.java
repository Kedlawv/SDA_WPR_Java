//package prog1;


package prog1;

public abstract class Person implements Driver, Comparable<Person> {

    private Sex sex;
    private String firstName, lastName;
    private int age;
    private boolean hasDrivingLicence;

    public Person(String firstName, String lastName, Sex sex, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.hasDrivingLicence = false;
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hasDrivingLicence = false;

    }

    @Override
    public int compareTo(Person o) {
        return age - o.getAge();
    }

    public abstract int getIdentity();

    public boolean isRetired() {
        if ((this.sex == Sex.MAN && age > 67) || (this.sex == Sex.WOMAN && age > 65)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "\n---------------\nImie: " + firstName + "\nNazwisko: " + lastName + "\nWiek: " + age + "\nPlec: "
                + sex.getPolishName() + (isRetired() ? "\nEmeryt" : "");
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean hasDrivingLicence() {
        return hasDrivingLicence;
    }

    public void setHasDrivingLicence(boolean hasDrivingLicence) {
        this.hasDrivingLicence = hasDrivingLicence;
    }
}
