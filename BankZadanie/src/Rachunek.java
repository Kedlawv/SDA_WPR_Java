import java.util.Objects;

public abstract class Rachunek {

    private String IBAN;
    private static int accNo = 1000000000;
    private long stan;

    {
        stan = 0;
    }

    public Rachunek(String nazwaBanku, String rodzaj){
        IBAN = nazwaBanku + accNo + rodzaj;
        accNo++;
    }

    public double sprawdzStan() {
        System.out.println("Stan konta " + IBAN + " to : " + (stan / (double)100));
        return stan / (double)100;
    }

    public void wplata(double kwota) {
        this.stan += kwota * 100;
        System.out.println("Wplacono : " + (this.stan / (double)100) + " na konto " + IBAN);
    }

    public void wyplata(double kwota)throws ZlyStan{
        if (stan >= kwota*100) {
            this.stan -= kwota * 100;
            System.out.println("Wyplacono : " + (this.stan / (double)100) + " z konta " + IBAN);
        }else{
            System.out.println("---------------------->Niewystarczajaca ilosc pieniedzy na koncie");
            throw new ZlyStan();
        }
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
