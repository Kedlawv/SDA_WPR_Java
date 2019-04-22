import java.util.Scanner;

public class practice3
{
    public static void main(String[] args)
    {
        double dollars = 3.73D;
        double euro = 4.54;
        double pounds = 5.34;

        double ammount;

        Scanner scanner = new Scanner(System.in);




        do
        {

            System.out.println("Podaj kwote do przliczenia :");

            ammount = scanner.nextDouble();
            if(!((Double)ammount instanceof Double))
            {
                System.out.println("Wprowadzona wartosc jest nie prawidlowa");
            }
        }
        while(!((Double)ammount instanceof Double));















    }
}
