import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        double dollars = 3.45D;
        double pounds = 5.04D;
        double euro = 4.56D;

        double ammount = -1.0D;
        String currency = new String();
        double result = -1;

        Scanner scanner = new Scanner(System.in);

        while(ammount < 0)
        {
            System.out.println("Podaj kwote do przeliczenia:");
            ammount = scanner.nextDouble();

            if (ammount < 0)
            {
                System.out.println("Prosze podac kwote wieksza od zera");
            }

        }

        while (currency.equals(""))
        {
            System.out.println("Prosze podac walute do przliczenia");
            System.out.println("GBP | USD | EURO");
            currency = scanner.next();

            switch(currency)
            {
                case "USD":
                {
                    result = dollars * ammount;
                    break;
                }

                case "GBP":
                {
                    result = pounds * ammount;
                    break;
                }

                case "EURO":
                {
                    result = euro * ammount;
                    break;
                }

                default:
                {
                    currency = "";
                    System.out.println("Nie obslugiwana waluta.");
                    System.out.println("Prosze sprobowac ponownie");

                }
            }

        }

        System.out.println();
        System.out.println("Wyliczona kwota to: " + result + " " + currency);
    }
}
