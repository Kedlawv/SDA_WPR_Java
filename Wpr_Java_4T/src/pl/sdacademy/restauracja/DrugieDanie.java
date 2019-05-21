package pl.sdacademy.restauracja;

public class DrugieDanie implements Danie {

    private String nazwa;
    private Double cena;

    public DrugieDanie(String nazwa2dania, double cena2dania){
        this.nazwa = nazwa2dania;
        this.cena = cena2dania;
    }

    @Override
    public double wartosc() {
        if (cena < 10) {
            return cena + 5;
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
