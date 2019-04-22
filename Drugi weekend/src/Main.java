import java.util.*;

public class Main {
    public static void main(String[] args) {

//        int[] myArray = {1, 2, 3, 4, 5};
//
//        for (int value : myArray) {
//            System.out.println(value);
//        }

//     int[] myArray = new int[100];
//
//     for(int i=0; i<myArray.length; i++){
//         myArray[i] = 100 - i;
//     }
//
//     for(int value: myArray){
//         System.out.println(value);
//     }
//        int[][] myArray = new int[10][10];
//        for (int i = 0; i < myArray.length; i++) {
//            for (int j = 0; j < myArray[0].length; j++) {
//                myArray[i][j] = i * 10 + j;
//            }
//        }
//
//        for(int[] value: myArray){
//            System.out.println(value.toString());
//            for(int valueIn: value){
//                System.out.println(valueIn);
//
//            }
//
//        }
//
//        ArrayList<Integer> myArraySingle = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        System.out.println(myArraySingle);

        // Zadanie 6.1

        int[] myArray = new int[5];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = new Random().nextInt(100);

        }

        // Zadanie 6.2


        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        int[] biggerArray = new int[myArray.length + 1];

        for (int i = 0; i < myArray.length; i++) {
            biggerArray[i] = myArray[i];
        }

        biggerArray[biggerArray.length - 1] = in.nextInt();

        for (int value : myArray) {
            System.out.print(value + " ");

        }

        System.out.println();

        for (int value : biggerArray) {
            System.out.print(value + " ");
        }

        // Zadanie 6.3

        int[] frontArray = new int[biggerArray.length + 1];
        System.out.println();
        System.out.println("Dodaj liczbe na poczatku tablicy: ");
        frontArray[0] = in.nextInt();

        for (int i = 0; i < biggerArray.length; i++) {
            frontArray[i + 1] = biggerArray[i];
        }

        for (int value : frontArray) {
            System.out.print(value + " ");
        }

        // Zadanie 6.4
        int indxSr = frontArray.length / 2;

        System.out.println("Index srodkowy: " + indxSr);
        System.out.println("Wartosc pod indexem srodkowym: " + frontArray[frontArray.length / 2]);

        // Zadanie 6.5

        int[] leftArray = new int[indxSr];
        int[] rightArray = new int[frontArray.length - indxSr];

//
        System.out.println("Dugosc tablicy frontArray: " + frontArray.length +
                "\nleftArray.length: " + leftArray.length +
                " rightArray.length: " + rightArray.length +
                "\nDlugosc tablicy frontArray rowna sie sumie leftArray i rightArray: " +
                (leftArray.length + rightArray.length == frontArray.length));

        for (int i = 0; i < frontArray.length; i++) {
            if (i < frontArray.length / 2) {
                leftArray[i] = frontArray[i];
            } else {
                rightArray[i - frontArray.length / 2] = frontArray[i];
            }
        }

        System.out.println("leftArray: ");
        for (int value : leftArray) {
            System.out.print(value + " ");
        }

        System.out.println();
        System.out.println("rightArray: ");

        for (int value : rightArray) {
            System.out.print(value + " ");
        }


    }
}
