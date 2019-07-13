import java.math.BigDecimal;

public class Pieniadze {
    BigDecimal ammount;
    Waluta waluta;

    public Pieniadze(BigDecimal ammount, Waluta waluta) {
        this.ammount = ammount;
        this.waluta = waluta;
    }
}
