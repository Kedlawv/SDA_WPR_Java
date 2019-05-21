package pl.sdacademy.restauracja2;


public class DrugieDanie extends Danie {

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

}
