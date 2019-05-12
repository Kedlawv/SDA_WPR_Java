package pl.sdacademy.restauracja;

public class Zupa implements Danie {

    private String nazwa;
    private Double cena;

    public Zupa(String nazwaZupy, double cenaZupy) {
        this.nazwa = nazwaZupy;
        this.cena = cenaZupy;
    }

    @Override
    public double wartosc() {
        if (cena > 20) {
            return cena * 0.9;
        }
        return cena;
    }

    @Override
    public String toString() {
        return String.format("%15s za %3.2f", nazwa, cena);
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Double getCena() {
        return cena;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }
}
