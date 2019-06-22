import java.util.Objects;

public abstract class Rachunek {

    private String IBAN;
    static int accNo = 1_000_000_000;
    private long stan;

    {
        stan = 0;
    }

    public Rachunek(String nazwaBanku, RodzajKonta rodzaj){
        IBAN = nazwaBanku + accNo + rodzaj;
        accNo++;
    }

    public double sprawdzStan() {
        System.out.println("Stan konta " + IBAN + " to : " + (convertToCents()));
        return convertToCents();
    }

    public void wplata(double kwota) {
        this.stan += convertToDollars(kwota);
        System.out.println("Wplacono : " + (convertToCents()) + " na konto " + IBAN);
    }

    public void wyplata(double kwota)throws ZlyStan{
        if (stan >= convertToDollars(kwota)) {
            this.stan -= convertToDollars(kwota);
            System.out.println("Wyplacono : " + (convertToCents()) + " z konta " + IBAN);
        }else{
            System.out.println("---------------------->Niewystarczajaca ilosc pieniedzy na koncie");
            throw new ZlyStan();
        }
    }

    private double convertToDollars(double kwota) {
        return kwota * 100;
    }

    private double convertToCents() {
        return stan / (double) 100;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    @Override
    public String toString() {
        return "Rachunek{" +
                "IBAN=" + IBAN +
                ", stan=" + stan + "gr|" + sprawdzStan() +
                '}'+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rachunek rachunek = (Rachunek) o;
        return IBAN == rachunek.IBAN &&
                stan == rachunek.stan;
    }

    @Override
    public int hashCode() {
        return Objects.hash(IBAN);
    }


}
