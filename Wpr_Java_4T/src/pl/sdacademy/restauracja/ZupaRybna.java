package pl.sdacademy.restauracja;

public class ZupaRybna implements Danie{
    String nazwa;
    Double cena;

    public ZupaRybna(String nazwa, double cena){
        this.nazwa = nazwa;
        this.cena = cena;
    }


    @Override
    public double wartosc() {
        return 0;
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
