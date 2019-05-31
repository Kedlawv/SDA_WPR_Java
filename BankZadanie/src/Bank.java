import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String nazwaBanku;
    private List<Klient> klientList;


    {
        klientList = new ArrayList<>();
    }


    public Bank(String nazwaBanku) {
        this.nazwaBanku = nazwaBanku;
    }

    public void dodajKlienta(Klient klient) {
        if (!klientList.contains(klient)) {
            klientList.add(klient);
            System.out.println("Klient " + klient + "zostal dodany");
        } else {
            System.out.println("Klient " + klient + " juz istnieje.");
        }
    }

    public void usunKlienta(Klient klient) throws ZlyStan {
        System.out.println(klient);
        if (klient.getRachunekList().isEmpty()) {
            klientList.remove(klient);
            System.out.print("zostal usuniety\n");
        } else {
            System.out.println("NIE zostal usuniety\n");
            System.out.println("Lista kont nie jest pusta");
            throw new ZlyStan();
        }
    }

    public String getNazwaBanku() {
        return nazwaBanku;
    }

    public void setNazwaBanku(String nazwaBanku) {
        this.nazwaBanku = nazwaBanku;
    }

    public List<Klient> getKlientList() {
        return klientList;
    }

    public Klient getKlientById(int klientId) {
        for (Klient k : klientList) {
            if (k.getId() == klientId) {
                return k;
            }
        }
        return null;
    }

    public void printKlientListZSaldo() {
        for (Klient k : klientList) {
            System.out.println(k);
            System.out.println(k.getRachunekList());
        }
    }

    public void setKlientList(List<Klient> klientList) {
        this.klientList = klientList;
    }
}
