import interfejsy.Osoba;

public class Czlowiek implements Osoba {

    String imie;
    String nazwizsko;

    public Czlowiek(String imie, String nazwisko){
        this.imie = imie;
        this.nazwizsko = nazwisko;
    }

    @Override
    public void przedstawSie() {
        //TODO implement method
    }
}
