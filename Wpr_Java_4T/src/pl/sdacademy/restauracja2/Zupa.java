package pl.sdacademy.restauracja2;

public class Zupa extends Danie {

    public Zupa(String nazwaZupy, double cenaZupy) {
        this.nazwa = nazwaZupy;
        this.cena = cenaZupy;
    }

    @Override
    public double wartosc () {
        if (cena < 20) {
            return cena * 9;
        }
        return cena;

    }
}
