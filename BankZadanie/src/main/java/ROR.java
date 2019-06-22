public class ROR extends Rachunek {

    private static RodzajKonta rodzajKonta = RodzajKonta.ROR;

    public ROR(String nazwaBanku) {
        super(nazwaBanku, rodzajKonta);
    }
}
