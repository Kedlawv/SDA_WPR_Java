package pl.sdacademy.restauracja2;

public abstract class Danie {
    protected String nazwa;
    protected double cena;

    abstract double wartosc();

    @Override
    public String toString() {
        return String.format("%s za %3.2f", nazwa,cena);
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
}
