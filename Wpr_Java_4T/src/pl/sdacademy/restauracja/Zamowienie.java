package pl.sdacademy.restauracja;

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
        return String.format("%17s","Pierwsze danie: ") + pierwszeDanie
                + String.format("%17s","\nDrugie danie: ") + drugieDanie
                + String.format("%17s","\nDeser: ") + deser;
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
