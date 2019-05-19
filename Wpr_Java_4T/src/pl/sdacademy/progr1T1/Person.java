package pl.sdacademy.progr1T1;

public class Person {

    private Sex sex;
    private String firstName, lastName;
    private int age;

    public boolean isRetired (){
        if((this.sex == Sex.MAN && age > 67) || (this.sex == Sex.WOMAN && age > 65)){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "\nImie: " + firstName + "\nNazwisko: " + lastName + "\nWiek: " + age + "\nPlec: "
                + sex + "\nJest na emeryturze: " + isRetired() ;
    }

    public Person(String firstName, String lastName, Sex sex, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
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



}
