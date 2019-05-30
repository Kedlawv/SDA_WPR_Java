import java.util.Random;
import java.util.Scanner;

public class Zadania7 {

    public static void main(String[] args) {
//        System.out.println(findMax(getRandomTable(10, 20)));
//        removeAtIndex(3);
//        removeValue(39);
        toto();


    }

    static int[] findMax(int[] tab) {
        int max = 0;
        int maxsIndex = 0;

        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
            if (tab[i] > max) {
                max = tab[i];
                maxsIndex = i;
            }
        }
        System.out.println();
        System.out.println("Max = " + max + " | index of max = " + maxsIndex);

        return new int[]{max, maxsIndex};
    }

    static int[] getRandomTable(int size, int range) {
        int[] tab = new int[size];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = new Random().nextInt(range);
        }
        return tab;
    }

    static int[] totoLiczby() {
        int[] tab = new int[6];
        int i = 0;
        System.out.println();
        System.out.println("Liczby wylosowane: ");
        while (i < tab.length) {
            int rNum = new Random().nextInt(49) + 1;
            if (!contains(rNum, tab)) {
                tab[i] = rNum;
                System.out.print(tab[i] + " ");
                i++;
            }

        }
        System.out.println();
        return tab;
    }

    static void removeAtIndex(int idx) {
        int tab[] = getRandomTable(10, 20);

        int index = idx;
        int[] tabMinus1 = new int[tab.length - 1];
        int j = 0;

        for (int i = 0; i < tab.length; i++) {

            if (i == index) {
                continue;
            }
            tabMinus1[j] = tab[i];
            j++;
        }

        for (int el : tabMinus1)
            System.out.print(el + " ");
    }

    static void removeValue(int val) {
        int tab[] = new int[]{10, 21, 39, 43, 58, 39, 99};

        int value = val;
        int[] tabMinusCount = new int[tab.length - countValInTab(val, tab)];
        int j = 0;

        for (int i = 0; i < tab.length; i++) {

            if (tab[i] == val) {
                continue;
            }
            tabMinusCount[j] = tab[i];
            j++;
        }

        for (int el : tabMinusCount)
            System.out.print(el + " ");
    }

    static int countValInTab(int val, int[] tab) {
        int count = 0;

        for (int el : tab) {
            if (el == val) {
                count++;
            }
        }
        return count;
    }

    static boolean isInRange(int num, int minimum, int maximum) {
        int min = minimum;
        int max = maximum;

        return (num >= min) && (num <= max);
    }

    static void toto() {
        int[] userNumbers = new int[6];
//        int[] randomNumbers = getRandomTable(6, 49);
        Scanner scanner = new Scanner(System.in);
        int userNumbersCount = 0;
        System.out.println("Podaj 6 liczb w przedziale 1-49:");

        while (userNumbersCount < userNumbers.length) {

            System.out.println("Liczba " + (userNumbersCount + 1) + " :");
            int scanNumber = scanner.nextInt();
            if (isInRange(scanNumber, 1, 49)
                    && !contains(scanNumber, userNumbers)) {
                userNumbers[userNumbersCount] = scanNumber;
                userNumbersCount++;
            } else {
                System.out.println("Podana liczba jest nie prawidlowa.");
                System.out.println("Podaj unikalna liczbe w zakresie 1-49.");
            }
        }
        System.out.print("Liczby uzytkownika: ");
        printTableInLine(userNumbers);

        int[] numbersDraw = totoLiczby();

        compareTables(userNumbers, numbersDraw);


    }

    static void printTableInLine(int[] tab) {
        for (int el : tab) {
            System.out.print(el + " ");
        }
    }

    static boolean contains(int num, int[] table) {
        for (int el : table) {
            if (el == num) {
                return true;
            }
        }
        return false;
    }

    static void compareTables(int[] tab1, int[] tab2) {
        System.out.println("Trafione liczby: ");
        for (int el1 : tab1) {
            for (int el2 : tab2) {
                if (el1 == el2) {
                    System.out.print(el1);
                    break;
                }
            }
        }
    }
}
