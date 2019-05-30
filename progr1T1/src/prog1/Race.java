package prog1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Race implements Comparable<Race>{
    private String raceName;
    private List<Person> drivers;
    private int miniumDriverAge;
    private int driverNumber;
    private List<RaceResult> results;


    {
        drivers = new ArrayList<>();
        results = new ArrayList<>();
    }

    public Race(String raceName, int minimumDriverAge){
        this.raceName = raceName;
        this.miniumDriverAge = minimumDriverAge;
    }

    public Race(String raceName) {
        this.raceName = raceName;
    }

    @Override
    public int compareTo(Race o) {
        return miniumDriverAge - o.getMiniumDriverAge();
    }

    public boolean raceResult(Person driver){
        results.add(new RaceResult(driver));
        return true;
    }

    public boolean setDriverList(List<Person> drivers){
        int numDriver = 0;
        for(Person d : drivers){
            if(addDriver(d)){
                numDriver++;
            }


        }
        System.out.printf("Dodano %d kierowcow%n",numDriver);
        return true;
    }

    public boolean addDriverUSet(Person person){
        Set<Person> driversSet = new HashSet(drivers);

        if (person.getAge() > miniumDriverAge) {
            driversSet.add(person);
            System.out.println("Kierowca dodany");
            drivers = new ArrayList<>(driversSet);
            return true;
        }
        System.out.println("Kierowca NIE dodany");
        return false;
    }


    public boolean addDriver(Person driver){
        Integer driverIndex = drivers.indexOf(driver);
        //System.out.println("Driver index Add: " + driverIndex);

        if(driverIndex != -1){
            System.out.printf("Kierowca %s %s jest juz na liscie%n",driver.getFirstName(),driver.getLastName());
            return false;
        }

        if(driver.getAge() > miniumDriverAge){
            drivers.add(driver);
            System.out.printf("Kierowca %s %s zostal(a) dodany%n",driver.getFirstName(),driver.getLastName());

            return true;
        }

        System.out.printf("ERROR ! Kierowca %s %s nie dodany(a)%n",driver.getFirstName(),driver.getLastName());
        return false;
    }

    public boolean removeDriver(Person driver){
        Integer driverIndex  = drivers.indexOf(driver);
        System.out.println("Driver index Remove: " + driverIndex);

        if(driverIndex != -1){
            if(checkDriverInRaceResults(driver) != null){
                results.remove(checkDriverInRaceResults(driver));
            }
            drivers.remove(driverIndex);
            System.out.printf("Kierowca %s %s zostal usuniety%n",driver.getFirstName(),driver.getLastName());
            return true;
        }
        System.out.printf("Kierowca %s %s nie zostal znaleziony%n",driver.getFirstName(),driver.getLastName());
        return false;
    }

    public RaceResult checkDriverInRaceResults(Person driver){
        for(RaceResult rr : results){
            if(rr.getDriver().equals(driver)){
                return rr;
            }
        }
        return null;
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

    @Override
    public String toString() {
        return "|" + raceName + "| min age: " + miniumDriverAge;
    }
}
