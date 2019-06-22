import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Klient {
    private String imie;
    private String nazwisko;
    private List<Rachunek> rachunekList;
    private static int idCounter = 1000;
    private int id;


    {
        rachunekList = new ArrayList<>();
        this.id = idCounter++;
    }


    public Klient(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;

    }

    public Klient(String imie, String nazwisko, Rachunek rachunek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rachunekList.add(rachunek);
    }

    public void addRachunek(Rachunek rachunek) {
        rachunekList.add(rachunek);
    }

    public void deleteRachunek(Rachunek rachunek) throws ZlyStan {
        if (!rachunekList.isEmpty()) {
            if (rachunek.sprawdzStan() == 0) {
                rachunekList.remove(rachunek);
            }else{
                System.out.println("Konto nie ma zerowego salda");
                throw new ZlyStan();
            }
        } else {
            System.out.println("\nLista kont jest pusta");
            throw new ZlyStan();
        }

    }

    public void deleteRachunek(int num) throws ZlyStan {
        if (!rachunekList.isEmpty()) {
            String accIban = this.rachunekList.get(num).getIBAN();
            if (this.rachunekList.get(num).sprawdzStan() == 0) {
                rachunekList.remove(this.rachunekList.remove(num));
                System.out.printf("*********************\n" +
                        "Konto %s zostalo usuniete" +
                        "\n*************************", accIban);
            }else{
                System.out.println("Konto nie ma zerowego salda");
                throw new ZlyStan();
            }
        } else {
            System.out.println("\nLista kont jest pusta");
            throw new ZlyStan();
        }
    }

    public List<Rachunek> getRachunekList() {
        return rachunekList;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "\n\n_________________________________________________" +
                "\nKlient{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", id=" + id +
                '}' +
                "\n____________________________________________________";
    }

    public String toStringRachunki() {
        return "\n\n_________________________________________________" +
                "\nKlient{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", id=" + id + "\n" + rachunekList +
                '}' +
                "\n____________________________________________________";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Klient klient = (Klient) o;
        return id == klient.id &&
                Objects.equals(imie, klient.imie) &&
                Objects.equals(nazwisko, klient.nazwisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, id);
    }
}
