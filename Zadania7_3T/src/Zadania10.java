import java.util.Random;

public class Zadania10 {
    static int[] randArray(int size){
        int[] tabN = new int[size];
        for(int i=0; i<tabN.length; i++){
            tabN[i] = new Random().nextInt(51);
            System.out.print(tabN[i] + " ");
        }
        System.out.println();

        return tabN;
    }

    static int getMax(int[] arr){
        int maxVal = arr[0];
        for(int val : arr){
            if (val > maxVal){
                maxVal = val;
            }
        }
        System.out.println("\nMax value: " + maxVal);
        return maxVal;
    }

    static int getMin(int[] arr){
        int minVal = arr[0];
        for(int val : arr){
            if (val < minVal){
                minVal = val;
            }
        }
        System.out.println("\nMin value: " + minVal);
        return minVal;
    }

    static int getSum(int[] arr){
        int sum = 0;
        for(int num : arr){
            sum += num;
        }
        System.out.println("\nsum = " + sum);
        return sum;
    }

    static int[] getMaxMinAndSum(int[] arr){
        int[] result = new int[3];
        result[0] = getMax(arr);
        result[1] = getMin(arr);
        result[2] = getSum(arr);

        return result;
    }

    static int[] getLarger(int[] arr1, int[] arr2){
        int arrSum1 = getSum(arr1);
        int arrSum2 = getSum(arr2);
        System.out.println("Wieksza tablica to: "
                + (arrSum1 > arrSum2 ? "Tablica 1" : "Tablica 2"));

        return arrSum1 > arrSum2 ? arr1 : arr2; //Ternary operator. Krotsza forma if else
    }

    public static void varG(int[] varargs){
        for(int i : varargs){
            System.out.print(i);
        }
    }

    // GitHub test






    public static void main(String[] args){

//        getMax(randArray(10));
//        getMin(randArray(10));
//        getSum(randArray(10));
//        getMaxMinAndSum(randArray(10));
//        for(int el : getMaxMinAndSum(randArray(10))){
//            System.out.print(el + " ");
//        }

//        getLarger(randArray(10),randArray(10));


//        Punkt punkt = new Punkt();
//        punkt.wypiszX();
//        punkt.wypiszY();
//
//        varG(new int[]{1,4,5,6,7,7,8});

    }
}
