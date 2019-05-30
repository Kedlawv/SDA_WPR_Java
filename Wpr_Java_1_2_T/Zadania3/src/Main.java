import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        //getCube();
        //obliczPoleProstokata();
        obliczPoleFiguryPlaskiej();
    }

    public static void getCube() {
        int value = 0;

        System.out.println("Podaj liczbe do podniesienia do potegi trzeciej:");

        Scanner scanner = new Scanner(System.in);
        value = scanner.nextInt();

        System.out.println(value + " do potegi trzeciej rowna sie : " + (value * value * value));
    }

    public static void obliczPoleProstokata() {
        double a;
        double b;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Podaj wartosc boku a:");
            System.out.println("Wartosc mosi byc wieksza od zera");
            a = scanner.nextDouble();
        }
        while (a <= 0);

        do {
            System.out.println("Podaj wartosc boku b:");
            System.out.println("Wartosc mosi byc wieksza od zera");
            b = scanner.nextDouble();
        }
        while (b <= 0);


        System.out.println("Pole prostokata o bokach a=" + a + " b=" + b + " rowna sie:" + (a * b));
    }

    public static void obliczPoleFiguryPlaskiej() {
        int wybor;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Prosze podac pole jakiej figur chesz obliczyc ");
        System.out.println("1. Trojkat");
        System.out.println("2. Kwadrat");
        System.out.println("3. Prostokat");
        System.out.println("4. Kolo");

        wybor = scanner.nextInt();

        if (wybor == 1) {
            int podstawa;
            int wysokosc;

            System.out.println("Prosze podac podstawe:");
            podstawa = scanner.nextInt();
            checkValue(podstawa);

            System.out.println("Prosze podac wysokosc:");
            wysokosc = scanner.nextInt();
            checkValue(wysokosc);

            System.out.println("Pole trojkata: " + (podstawa * wysokosc / 2));
        }

        if (wybor == 2) {
            int a;

            System.out.println("Prosze podac bok a:");
            a = scanner.nextInt();
            checkValue(a);

            System.out.println("Pole kwadratu: " + (a * a));
        }

        if (wybor == 3) {
            int a;
            int b;

            System.out.println("Prosze podac bok a:");
            a = scanner.nextInt();
            checkValue(a);

            System.out.println("Prosze podac bok b:");
            b = scanner.nextInt();
            checkValue(b);

            System.out.println("Pole trojkata: " + (a * b));
        }

        if (wybor == 4) {
            int r;


            System.out.println("Prosze podac promien:");
            r = scanner.nextInt();
            checkValue(r);


            System.out.println("Pole trojkata: " + (Math.PI * r * r));
        }
    }

    public static void checkValue(int value) {
        if (value <= 0) {
            System.out.print("Wartosc musi byc wieksza od zera");
            exit(0);
        }
    }


}
