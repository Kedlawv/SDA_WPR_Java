package pl.sdacademy.progr1T1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //System.out.println(pallMod(123));
        //minutesInYears(2123567);
        //getPrime(20);
        //System.out.println(isLeapYearIf(2000));
        //System.out.println(isLeapYearLogical(2000));
        //System.out.println(getDaysInMonth(12, 2001));
        //System.out.println(getDaysInMonthGrzegorz(2, 2001));
        //System.out.println(isPerfectNumber(28));
        //findPerfectNumbers(100000);

//        Person person = new Person("Jan", "Kowalski",Sex.MAN, 68);
//        Person person1 = new Person("Anna", "Jankowska", Sex.WOMAN, 34);
//
//        Person personPolish3 = new Polish("Adam", "Miech", Sex.MAN, 40, 32456,
//                "Polish", 4);
//
//
//        Polish personPolish1 = new Polish("Adam", "Miech", Sex.MAN, 40, 35456,
//                "Polish", 4);
//        Polish personPolish2 = new Polish("Ola", "Lubomirska", Sex.WOMAN, 62, 346457,
//                "Polish", 2);
//
////        System.out.println(person);
////        System.out.println(person1);
////        System.out.println(personPolish1);
////        System.out.println(personPolish2);
//
//        List<Person> personList = new ArrayList<>();
//
//        personList.add(person);
//        personList.add(person1);
//        personList.add(personPolish1);
//        personList.add(personPolish2);
//
//
//        List<Polish> polishList = new ArrayList<>();
//
//        polishList.add(personPolish1);
//        polishList.add(personPolish2);
//
////        for(Person per : personList){
////            System.out.println(per);
////        }
//
//        Map<Integer,Polish> polishMap = new HashMap<>();
//
//        polishMap.put(((Polish)personPolish3).getPesel(), (Polish)personPolish3);
//        polishMap.put(personPolish1.getPesel(), personPolish1);
//
//        System.out.println(((Polish) personPolish3).getPesel());


//        for(int pesel : polishMap.keySet()){
//            System.out.println(pesel);
//            System.out.println(polishMap.get(pesel));
//        }

//        Iterator<Integer> iteruj = polishMap.keySet().iterator();
//
//        while(iteruj.hasNext()){
//            int next = iteruj.next();
//            System.out.println(next);
//            System.out.println(polishMap.get(next));
//        }
//
//        Set<Integer> peselSet = polishMap.keySet();
//        Set<Polish> personSet = (Set)polishMap.values();

//        Set<Karta> talia = new HashSet<>();
//
//        for(ColorCard kolor : ColorCard.values()){
//            for(WartosciKart wartosc : WartosciKart.values()){
//                if(kolor == ColorCard.JOKER_BLACK || kolor == ColorCard.JOKER_RED){
//                    talia.add(new Karta(kolor, WartosciKart.JOKER));
//                    break;
//                }
//                if(wartosc == WartosciKart.JOKER){
//                    continue;
//                }
//                talia.add(new Karta(kolor, wartosc));
//            }
//        }
//
//        for(Karta karta : talia){
//            System.out.println(karta);
//        }

        Polish polPer1 = new Polish("Kazimierz", "Dzieciol", Sex.MAN, 44, 23456
                , 3);
        Polish polPer4 = new Polish("Adam", "Miech", Sex.MAN, 40, 35456
                , 4);
        Polish polPer3 = new Polish("Kazimierz", "Dzieciol", Sex.MAN, 44, 23456
                , 3);
        Polish polPer2 = polPer1;
        System.out.println(polPer1.equals(polPer2));
        System.out.println(polPer1.equals(polPer3));
        System.out.println(polPer4.equals(polPer1));

        System.out.println(polPer2.getSex().getByShortName("M"));

        Person polPer5 = new Polish("Genowefa", "Zawada", Sex.WOMAN, 53, 235236,
                2);
        Person polPer6 = new Polish("Ewa", "Kopiko", Sex.WOMAN, 39, 1235346,
                1);

        polPer5.setSex(Sex.getByShortName("F"));
        System.out.println(polPer5.getSex());

        System.out.println(Polish.getInstanceNumber());

        Person engPer1 = new English("John", "Smith", Sex.MAN, 39,
                0, 32523);
        Person engPer2 = new English("Jeremy", "Clarkson", Sex.MAN, 60,
                0, 38523);

        System.out.println(engPer1);

        Race race = new Race("Silverstone", 10);
        race.addDriver(engPer1);
        race.removeDriver(engPer1);
        race.removeDriver(engPer1);

        System.out.println("__________________");
        //System.out.println(race.getDrivers());

        List<Person> nowaLista = new ArrayList<>();
        nowaLista.add(polPer1);
        nowaLista.add(polPer4);
        nowaLista.add(polPer4);
        nowaLista.add(polPer4);
        nowaLista.add(polPer5);
        nowaLista.add(engPer1);
        nowaLista.add(polPer6);

        System.out.println("__________Nowa Lista");
        System.out.println(nowaLista);

        System.out.println();
        System.out.println(nowaLista.getClass());
        nowaLista = new LinkedList<>(nowaLista);
        System.out.println(nowaLista.getClass());

        Set<Person> nowySet = new HashSet<>();
        nowySet.add(polPer1);
        nowySet.add(polPer2);
        nowySet.add(polPer3);
        nowySet.add(polPer4);
        System.out.println(nowySet.getClass());
        nowySet = new LinkedHashSet<>(nowySet);
        System.out.println(nowySet.getClass());

        nowySet = new HashSet<>(nowaLista);
        System.out.println(nowySet);

        List<Set<Person>> listaSetow = new ArrayList<>();
        Set<Person> set1 = new HashSet<>(nowaLista);
        Set<Person> set2 = new HashSet<>(nowaLista);
        listaSetow.add(set1);
        listaSetow.add(set2);

        System.out.println();
        System.out.println("Lista setow , podwojna petla foreach");
        for (Set<Person> sp : listaSetow) {
            for (Person p : sp) {
                System.out.println(p);
            }
        }

        Map<Integer, Person> nowaMapa = new HashMap<>();
        for (Person p : nowaLista) {
            nowaMapa.put(p.getIdentity(), p);
        }

        System.out.println("Drukuj mape: \n -------------------------");
        System.out.println(nowaMapa);

        System.out.println("\n\n\nPrzed posortowaniem");
        System.out.println(nowaLista);

        Collections.sort(nowaLista);
        System.out.println("\n\n\nPo posortowaniu");
        System.out.println(nowaLista);

        List<Race> listaRace = new ArrayList<>();

        listaRace.add(new Race("Dubai", 14));
        listaRace.add(new Race("Syndey", 25));
        listaRace.add(new Race("Warsaw", 18));

        System.out.println("\n\n\n\n-----------------------------------");
        System.out.println("listaRace przed sortowaniem");
        System.out.println(listaRace);

        Collections.sort(listaRace);

        System.out.println("\nlistaRace po sortowaniu");
        System.out.println(listaRace);

        Collections.sort(nowaLista, new PersonSortedBySexAndName());

        System.out.println("\n\n\n\nnowaLista po posortowaniu przez PersonSortedBySexAndName: ");
        System.out.println(nowaLista);

        Collections.sort(nowaLista, new PersonSortedBySexAndAge());
        System.out.println("\n\n\n\nnowaLista po posortowaniu przez PersonSortedBySexAndAge: ");
        System.out.println(nowaLista);

        Race race1 = listaRace.get(0);

        race1.setDriverList(nowaLista);
        race1.addDriverUSet(engPer2);
        System.out.println("__________________________________________");
        System.out.println("Lista kierowcow : ");
        System.out.println(race1.getDrivers());

        Map<Integer,Person> personMap = new HashMap();
        for(Person p : nowaLista){
            personMap.put(p.getIdentity(),p);
        }

        System.out.println("\n\n\n\n\n************************************************");
        System.out.println("Mapa osob: ");
        for(int klucz : nowaMapa.keySet()){
            System.out.println(nowaMapa.get(klucz));
        }






///////////////////////////////////////////////////////////////////////
    }

    public static boolean pallindrome(int num) {
        boolean isPal = false;
        String string = new String(String.valueOf(Math.abs(num)));
        for (int i = 0; i < string.length() / 2; i++) {
            if (string.charAt(i) == string.charAt(string.length() - 1 - i)) {
                System.out.println(string.charAt(i) + " " + string.charAt(string.length() - 1 - i));
                isPal = true;
            } else {
                return false;
            }
        }
        return true;
    }


    public static boolean pallMod(int num) {
        int numAbs = Math.abs(num);
        int temp = 0;
        int numRev = 0;

        while (numAbs > 0) {

            System.out.println("numAbs: " + numAbs);
            temp = (numAbs % 10);
            System.out.println("temp: " + temp);
            numRev = numRev * 10 + temp;
            System.out.println("numRev: " + numRev);
            numAbs /= 10;

        }

        return numAbs == numRev;

    }

    public static void minutesInYears(long minutes) {

        long minutesLeft = minutes;
        long minutesInYear = 60 * 24 * 365;
        long minutesInDay = 60 * 24;
        long minutesInHour = 60;

        long years = minutesLeft / minutesInYear;
        minutesLeft -= years * minutesInYear;
        long days = minutesLeft / minutesInDay;
        minutesLeft -= days * minutesInDay;
        long hours = minutesLeft / minutesInHour;

        System.out.println("years :" + years + " days: " + days + " minutes: " + minutesLeft);


        System.out.println();
    }

    public static int getPrime(int number) {
        int[] arrDiv = new int[number];
        int[] arrPrimes = new int[number];
        int counter = 0;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                arrDiv[counter] = i;
                counter++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        counter = 0;
        for (int num : arrDiv) {
            if (isPrime(num)) {
                arrPrimes[counter] = num;
                counter++;

                System.out.print(num + " ");
            }
        }
        System.out.println();
        System.out.println(arrPrimes[counter - 1]);

        return arrPrimes[counter - 1];
    }

    public static boolean isPrime(int num) {
        if (num == 0) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isLeapYearIf(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean isLeapYearLogical(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }

        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static int getDaysInMonth(int month, int year) {
        boolean isLeapYear = isLeapYearLogical(year);
        boolean isFebuary = month == 2;

        if (month < 1 || month > 12) {
            return -1;
        }

        if (year < 1 || year > 9999) {
            return -1;
        }

        if (isFebuary) {
            if (isLeapYear) {
                return 29;
            } else {
                return 28;
            }
        }

        if (month <= 7) {
            if (month % 2 == 1) {
                return 31;
            }
            if (month % 2 == 0 && month != 2) {
                return 30;
            }
        } else {
            if (month % 2 == 1) {
                return 30;
            }
            if (month % 2 == 0) {
                return 31;
            }
        }
        return -1;
    }

    public static int getDaysInMonthGrzegorz(int month, int year) {
        if ((month < 1) || (month > 12))
            return -1;
        if ((year < 1) || (year > 9999))
            return -1;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (isLeapYearLogical(year)) {
                    return 29;
                } else {
                    return 28;
                }

        }
        return -1;
    }

    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        //System.out.println("sum: " + sum +" num: " + num);
        return sum == num;
    }

    public static void findPerfectNumbers(int range) {
        for (int i = 1; i <= range; i++) {
            if (isPerfectNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

