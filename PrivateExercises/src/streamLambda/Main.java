package streamLambda;

import com.sun.tracing.dtrace.ModuleName;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Jan Kowlaski", LocalDate.of(1980, 3, 12)
                , Person.Sex.MALE, "j.kowalski@gmail.com");
        Person person2 = new Person("Grzegorz Brzoza", LocalDate.of(1975, 8, 31)
                , Person.Sex.MALE, "g.brzoza@gmail.com");
        Person person3 = new Person("Anna Rzepa", LocalDate.of(1989, 4, 11)
                , Person.Sex.FEMALE, "a.rzepa@gmail.com");


        List<Person> personList = new ArrayList<>();
        personList.addAll(Arrays.asList(new Person[]{person, person2, person3}));

        Collections.sort(personList, new PersonAgeComparator()); // comparator object


        Collections.sort(personList, (Person a, Person b) -> {
                    return a.getBirthday().compareTo(b.getBirthday()); // lambda implementation
                }
        );

        Collections.sort(personList, (a, b) -> Person.compareByAge(a, b));// lambda method call

        Collections.sort(personList, Person::compareByAge); // static method referance
        // formal parameters od the second formal parameter is copied from the signature of the method expected
        // in this case Comparator<I>.compare


        Collections.sort(personList, person2::compareByName); // instance method call
        // call on the instance/object of class Person

        // https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html


    }
}
