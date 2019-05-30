import java.util.Scanner;

import static java.lang.System.exit;

public class CurrencyExchanger
{
    double amount;
    String currency = new String();
    double result;

    Scanner scanner = new Scanner(System.in);

    public void exchange()
    {
        amount = getAmount();
        calculateCurrency();
    }


    private double getAmount()
    {
        double amt = 0;

        do
        {
            System.out.println("Podaj kwote do przeliczenia:");
            System.out.println("Prosze podac kwote wieksza od zera.");
            System.out.println("0 - wyjscie z programu.");

            Scanner scannerIn = new Scanner(System.in);

            try
            {
                amt = scannerIn.nextDouble();
                if(amt == 0)
                {
                    exit(0);
                }
            } catch (Exception e)
            {

                System.out.println("Prosze podac wartosc numeryczna");
                amt = -1;
                continue;
            }

        } while (amt < 0);
        return amt;
    }

    private void calculateCurrency()
    {
        while (currency.equals(""))
        {
            System.out.println("Prosze podac walute do przliczenia");
            System.out.println("GBP | USD | EURO");
            System.out.println("0 - wyjscie z programu.");
            currency = scanner.next();

            if(currency.equals("0"))
            {
                exit(0);
            }

            switch (currency)
            {
                case "USD":
                {
                    result = amount / Currencies.USD;
                    break;
                }

                case "GBP":
                {
                    result = amount / Currencies.GBP;
                    break;
                }

                case "EURO":
                {
                    result = amount / Currencies.EURO;
                    break;
                }

                default:
                {
                    currency = "";
                    result = 0;
                    System.out.println("Nie obslugiwana waluta.");
                    System.out.println("Prosze sprobowac ponownie");

                }
            }

        }
        System.out.println();
        System.out.println("Wyliczona kwota to: " + result + " " + currency);
    }

}
