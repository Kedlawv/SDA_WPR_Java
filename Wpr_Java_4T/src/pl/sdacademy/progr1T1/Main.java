package pl.sdacademy.progr1T1;

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

        Person person = new Person("Jan", "Kowalski",Sex.MAN, 68);
        Person person1 = new Person("Anna", "Jankowska", Sex.WOMAN, 34);

        System.out.println(person);
        System.out.println(person1);

        Polish personPolish1 = new Polish("Adam", "Miech", Sex.MAN, 40,
                "Polish", 4);
        Polish personPolish2 = new Polish("Ola", "Lubomirska", Sex.WOMAN, 62,
                "Polish", 2);

        System.out.println(personPolish1);
        System.out.println(personPolish2);


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

    public static void findPerfectNumbers(int range){
        for(int i = 1 ; i <= range; i++){
            if(isPerfectNumber(i)){
                System.out.print(i + " ");
            }
        }
    }
}

