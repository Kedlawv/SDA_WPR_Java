package pl.sdacademy.restauracja;

public class Deser implements Danie {

    public String nazwa;
    public Double cena;

    public Deser(String nazwaDeseru, double cena_deseru){
        this.nazwa = nazwaDeseru;
        this.cena = cena_deseru;
    }


    @Override
    public double wartosc() {

        if (cena < 9) {
            return cena + 5;
        }

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
