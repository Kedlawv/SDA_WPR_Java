package prog1;

import java.util.Comparator;

public class PersonSortedBySexAndAge implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        int result = o1.getSex().getPolishName().compareTo(o2.getSex().getPolishName());

        if (result != 0) {
            return result;
        } else {
            if (o1.getAge() < o2.getAge()) {        // or o1.getAge() - o2.getAge()
                return -1;                          //
            } else if (o1.getAge() > o2.getAge()) { //
                return 1;                           //
            } else {                                //
                return 0;                           //
            }                                       //
        }
    }
}
