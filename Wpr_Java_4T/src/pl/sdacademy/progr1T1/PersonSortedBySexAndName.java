package pl.sdacademy.progr1T1;

import java.util.Comparator;

public class PersonSortedBySexAndName implements Comparator<Person> {


    @Override
    public int compare(Person o1, Person o2) {
        int result = o1.getSex().getPolishName().compareTo(o2.getSex().getPolishName());

        if (result != 0) {
            return result;
        } else {
            if (o1.getLastName().compareTo(o2.getLastName()) != 0) {
                return o1.getLastName().compareTo(o2.getLastName());
            } else {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        }
    }
}
