package warmup;

import java.util.Objects;

public class Money {

    private Currency currency;
    private float amount;



    public Money(Currency currency, float amount){
        this.currency = currency;
        this.amount = amount;
    }

    public static Money parse(String moneyAsText){
        try {
            String[] splitString = moneyAsText.split(" ");
            Currency parsedCurrency = Currency.valueOf(splitString[0]);
            float ammount = Float.parseFloat(splitString[1]);

            return new Money(parsedCurrency, ammount);
        }
        catch(IllegalArgumentException o){
            throw new RuntimeException("Wrong arguments");

        }
    }

    @Override
    public String toString() {
        return String.format("%s %.2f",Currency.Euro,amount);
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return Float.compare(money.amount, amount) == 0 &&
                currency == money.currency;
    }

    @Override
    public int hashCode() {
        return Objects.hash(currency, amount);
    }
}
