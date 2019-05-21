package pl.sdacademy.wprowadzenie;

public class Main {

    public static void main(String[] args) {

        Robot rob1 = new Robot();
        Robot rob2 = new Robot();


        System.out.println("Przed zmiana");
        System.out.println("Robot1");
        rob1.wypisz_predkosc();
        rob1.wypisz_wysokosc();

        int bin = 0b0010  ;

        System.out.println("Robot2");

        rob2.wypisz_predkosc();
        rob2.wypisz_wysokosc();

        rob1.wysokosc = 99;
        Robot.predkosc = 99;

        System.out.println("Po zmianie");
        System.out.println("Robot1");
        rob1.wypisz_predkosc();
        rob1.wypisz_wysokosc();

        System.out.println("Robot2");
        rob2.wypisz_predkosc();
        rob2.wypisz_wysokosc();

        System.out.println(rob1.getSila());
        rob1.napiecieSpecjalne = 0;
        System.out.println(rob1.getSila());

        Robot robo3 = new Robot();
        robo3.wysokosc = 7;

        robo3.czynnosci = new Robot.Czynnosc[3];
        robo3.czynnosci[0] = new Robot.Czynnosc(Robot.DO_PRZODU);
        robo3.czynnosci[1] = new Robot.Czynnosc(Robot.SKRET_W_LEWO);
        robo3.czynnosci[2] = new Robot.Czynnosc(Robot.STOP);

        robo3.akcja(robo3.czynnosci);

        System.out.println(robo3);

        System.out.println(rob1.hashCode());
        System.out.println(rob2.hashCode());
        System.out.println(robo3.hashCode());


    }
}
