public class OszczednosciowyRachunek extends Rachunek {

    private static RodzajKonta rodzajKonta = RodzajKonta.OSZCZEDNOSCIOWE;

    public OszczednosciowyRachunek(String nazwaBanku) {
        super(nazwaBanku, rodzajKonta);
    }
}
