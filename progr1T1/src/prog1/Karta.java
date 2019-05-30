package prog1;

public class Karta {
    private ColorCard kolor;
    private WartosciKart wartosc;

    public Karta(ColorCard kolor, WartosciKart wartosc) {
        this.kolor = kolor;
        this.wartosc = wartosc;
    }

    public ColorCard getKolor() {
        return kolor;
    }

    public void setKolor(ColorCard kolor) {
        this.kolor = kolor;
    }

    @Override
    public String toString() {
        return kolor.altName + " " + wartosc.wartosc;
    }

    public WartosciKart getWartosc() {
        return wartosc;
    }

    public void setWartosc(WartosciKart wartosc) {
        this.wartosc = wartosc;
    }
}
