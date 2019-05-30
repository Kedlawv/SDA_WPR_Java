public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("MojBank");
        bank.dodajKlienta(new Klient("Jan", "Kowalski", new ROR(bank.getNazwaBanku())));

        Klient jk = bank.getKlientList().get(0);
        jk.addRachunek(new OszczednosciowyRachunek(bank.getNazwaBanku()));

        System.out.println(bank.getKlientList());
        bank.printKlientListZSaldo();

        Rachunek nowyRachunek = (new OszczednosciowyRachunek(bank.getNazwaBanku()));
        Klient nowyKlient = new Klient("Piotr", "Jablonski",nowyRachunek);
        bank.dodajKlienta(nowyKlient);

        System.out.println(bank.getKlientList());
        bank.printKlientListZSaldo();

        Klient janKowalski1000 = bank.getKlientById(1000);
        Rachunek jkOszcz = janKowalski1000.getRachunekList().get(1);
        jkOszcz.wplata(12.36);
        jkOszcz.sprawdzStan();




        try {
            janKowalski1000.deleteRachunek(1);
        } catch (ZlyStan zlyStan) {
            zlyStan.printStackTrace();
        }

        System.out.println(janKowalski1000.toStringRachunki());


        try {
            janKowalski1000.getRachunekList().get(1).wyplata(12.36);
            janKowalski1000.deleteRachunek(1);
        } catch (ZlyStan zlyStan) {
            zlyStan.printStackTrace();
        }

        System.out.println(janKowalski1000.toStringRachunki());

        try {
            janKowalski1000.deleteRachunek(0);
            janKowalski1000.deleteRachunek(0);
        } catch (ZlyStan zlyStan) {
            System.out.println("");
            zlyStan.printStackTrace();
        }

        try {
            bank.usunKlienta(janKowalski1000);
        } catch (ZlyStan zlyStan) {
            zlyStan.printStackTrace();
        }


    }
}
