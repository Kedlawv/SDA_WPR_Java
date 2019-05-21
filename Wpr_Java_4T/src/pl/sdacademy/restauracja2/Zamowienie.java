package pl.sdacademy.restauracja2;

public class Zamowienie {
    private Danie pierwszeDanie;
    private Danie drugieDanie;
    private Danie deser;

    public double wartoscZamowienia(){
        return pierwszeDanie.wartosc()+
                drugieDanie.wartosc()+
                deser.wartosc();
    }

    @Override
    public String toString() {
        return String.format("%s\t\t","Pierwsze danie: ") + pierwszeDanie
                + String.format("%s\t\t","\nDrugie danie: ") + drugieDanie
                + String.format("%s\t\t","\nDeser: ") + deser;
    }

    public Danie getPierwszeDanie() {
        return pierwszeDanie;
    }

    public void setPierwszeDanie(Danie pierwszeDanie) {
        this.pierwszeDanie = pierwszeDanie;
    }

    public Danie getDrugieDanie() {
        return drugieDanie;
    }

    public void setDrugieDanie(Danie drugieDanie) {
        this.drugieDanie = drugieDanie;
    }

    public Danie getDeser() {
        return deser;
    }

    public void setDeser(Danie deser) {
        this.deser = deser;
    }
}
