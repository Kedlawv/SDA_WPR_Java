package pl.sdacademy.progr1T1;

import java.util.ArrayList;
import java.util.List;

public class Race {
    private String raceName;
    private List<Person> drivers;
    private int miniumDriverAge;


    {
        drivers = new ArrayList<>();
    }

    public Race(String raceName, int minimumDriverAge){
        this.raceName = raceName;
        this.miniumDriverAge = minimumDriverAge;
    }

    public Race(String raceName) {
        this.raceName = raceName;
    }

    public boolean setDriverList(List<Person> drivers){
        int numDriver = 0;
        for(Person d : drivers){
            addDriver(d);
            numDriver++;
        }
        System.out.printf("Dodano %d kierowcow%n",numDriver);
        return true;
    }

    public boolean addDriver(Person driver){
        Integer driverIndex = drivers.indexOf(driver);
        System.out.println("Driver index Add: " + driverIndex);

        if(driverIndex != null){
            System.out.printf("Kierowca %s %s jest juz na liscie%n",driver.getFirstName(),driver.getLastName());
        }

        if(driver.getAge() > miniumDriverAge){
            drivers.add(driver);
            System.out.printf("Kierowca %s %s zostal dodany%n",driver.getFirstName(),driver.getLastName());

            return true;
        }

        System.out.printf("ERROR ! Kierowca %s %s nie dodany%n",driver.getFirstName(),driver.getLastName());
        return false;
    }

    public boolean removeDriver(Person driver){
        Integer driverIndex  = drivers.indexOf(driver);
        System.out.println("Driver index Remove: " + driverIndex);

        if(driverIndex != null){
            drivers.remove(driverIndex);
            System.out.printf("Kierowca %s %s zostal usuniety%n",driver.getFirstName(),driver.getLastName());
            return true;
        }
        System.out.printf("Kierowca %s %s nie zostal znaleziony%n",driver.getFirstName(),driver.getLastName());
        return false;
    }

    public String getRaceName() {
        return raceName;
    }

    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }

    public int getMiniumDriverAge() {
        return miniumDriverAge;
    }

    public void setMiniumDriverAge(int miniumDriverAge) {
        this.miniumDriverAge = miniumDriverAge;
    }

    public List<Person> getDrivers() {
        return drivers;
    }
}
