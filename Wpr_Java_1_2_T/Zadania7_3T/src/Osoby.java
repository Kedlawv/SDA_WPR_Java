import interfejsy.Osoba;

public class Osoby {
    Osoba[] ludzie;

    public Osoby(){
        ludzie = new Osoba[5];
    }

    public void przedsaw(Osoba[] osoby){
        for(Osoba osoba : osoby){
            System.out.println(osoba);
        }
    }
}
