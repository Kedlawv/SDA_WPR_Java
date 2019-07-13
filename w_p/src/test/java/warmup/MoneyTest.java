package warmup;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import warmup.Currency;
import warmup.Money;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

    Money money;

    @BeforeEach
    public void createMoneyObject() {
        money = new Money(Currency.Euro, 20.34f);
    }

    @Test
    void toStringTrueIfCorrectValue() {

        System.out.println(money);
        String expectedString = "Euro 20.34";

        assertEquals(expectedString, money.toString());
    }

    @Test
    void trueIfGetsRightKind() {

        Currency expectedCurrency = Currency.Euro;

        assertEquals(expectedCurrency, money.getCurrency());
    }

    @Test
    void trueIfGetsRightAmount() {

        float expectedAmount = 20.34f;

        assertEquals(expectedAmount, money.getAmount());
    }

    @Test
    void trueIfEquals(){
        Money moneyOther = new Money(Currency.Euro, 20.34f);

        assertEquals(money, moneyOther);
    }

    @Test
    void falseIfNotEquals(){
        Money moneyOther = new Money(Currency.GBP, 23.56f);

        assertNotEquals(money, moneyOther);
    }

    @Test
    void trueForCorrectValuesParseTest(){
        Money parsedMoney = Money.parse("Euro 23.34");
        Money moneyExpected = new Money(Currency.Euro, 23.34f);

        assertEquals(parsedMoney, moneyExpected);
    }

//    @Test
//    void throwsExceptionIfInvalidArgumentParseTest(){
//        warmup.Money parsedMoney = warmup.Money.parse("dfr 23.56");
//
//        assertThrows()
//    }
}