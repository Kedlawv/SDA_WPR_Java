package pl.sdacademy.wprowadzenie;

public class Robot {
    public static int predkosc = 10;
    public static int napiecieGlobalne = 5;
    public int wysokosc = 20;
    public int napiecieSpecjalne = 2;

    public static final String DO_PRZODU = "do przodu";
    public static final String DO_TYL = "do tyl";
    public static final String SKRET_W_LEWO = "skret w lewo";
    public static final String SKRET_W_PRAWO = "skret w prawo";
    public static final String STOP = "STOP";

    Czynnosc[] czynnosci;
    public Silnik silnikLewy, silnikPrawy;

    @Override
    public String toString() {
        return "Predkosc: " + predkosc + " Wysokosc " + wysokosc;
    }

    @Override
    public int hashCode() {
        int hash = 2;
        hash = 31 * hash + wysokosc;
        hash = (hash << 5) - hash + predkosc;
        return hash;
    }


    public static class Czynnosc {
        public String nazwa;

        public Czynnosc(String nazwa) {
            this.nazwa = nazwa;
        }

        public void dzialaj() {
            System.out.println("Wykonuje: " + nazwa);
        }
    }

    public static class Silnik {
        public int moc;
        public int napiecie;
        public String model;
    }

    public void akcja(Czynnosc[] czynnosci) {
        for (Czynnosc czynnosc : czynnosci) {
            czynnosc.dzialaj();
        }
    }

    public void wypisz_predkosc() {
        System.out.println("Predkosc: " + predkosc);
    }

    public void wypisz_wysokosc() {
        System.out.println("Wysokosc: " + wysokosc);
    }

    public int getSila() {
        int napiecie = napiecieSpecjalne > 0 ? napiecieSpecjalne : napiecieGlobalne;

        return predkosc / napiecie * wysokosc;
    }

    public static void wypiszInformacje(Robot robot) {
        robot.wypisz_wysokosc();
        robot.wypisz_predkosc();
    }

    public static void zmienPredkosc(int val) {
        predkosc += val;
    }

    public void zmienWysokosc(int val) {
        if ((wysokosc - val) < 0) {
            return;
        }
        wysokosc += val;
    }

    public static int getNapiecieGlobalne() {
        return napiecieGlobalne;
    }

    public static void setNapiecieGlobalne(int napiecieGlobalne) {
        if (napiecieGlobalne < 0) {
            return;
        }
        Robot.napiecieGlobalne = napiecieGlobalne;
    }

    public int getNapiecieSpecjalne() {
        return napiecieSpecjalne;
    }

    public void setNapiecieSpecjalne(int napiecieSpecjalne) {
        if (napiecieSpecjalne < 0) {
            return;
        }
        this.napiecieSpecjalne = napiecieSpecjalne;
    }

    public Silnik getSilnikLewy() {
        return silnikLewy;
    }

    public Silnik getSilnikPrawy() {
        return silnikPrawy;
    }

    public void setSilnikLewy(Silnik silnikLewy) {
        this.silnikLewy = silnikLewy;
    }

    public void setSilnikPrawy(Silnik silnikPrawy) {
        this.silnikPrawy = silnikPrawy;
    }
}
