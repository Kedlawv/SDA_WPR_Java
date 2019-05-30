import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int userNumber;

        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Podaj liczbe:");
        userNumber = scanner.nextInt();


        for (int i = 0; i <= userNumber; i++) {
            System.out.println(i);
        }*/

        /*System.out.println("Podaj liczbe:");

        userNumber = scanner.nextInt();

        if(userNumber % 2 == 0){
            System.out.println("Liczba jest parzysta " + userNumber);

        }else{
            System.out.println("Liczba jest nieparzysta.");
        }*/

        /*userNumber = scanner.nextInt();
        int oddSum = 0;

        for (int i = 1; i < userNumber; i++) {
            if (i % 2 == 1) {
                oddSum += i;
            }
        }

        System.out.println(oddSum);*/

        int oddSum = 0;


        do {
            userNumber = scanner.nextInt();
            if (userNumber % 2 == 1) {
                oddSum += userNumber;
            }

        } while (userNumber != 0);

        System.out.println("Suma: " + oddSum);


    }


}
