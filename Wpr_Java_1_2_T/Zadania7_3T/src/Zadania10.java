import java.util.Random;

public class Zadania10 {
    static int[] randArray(int size) {
        int[] tabN = new int[size];
        for (int i = 0; i < tabN.length; i++) {
            tabN[i] = new Random().nextInt(51);
            System.out.printf("%2d ", tabN[i]);
        }
        System.out.println();

        return tabN;
    }

    static int getMax(int[] arr) {
        int maxVal = arr[0];
        for (int val : arr) {
            if (val > maxVal) {
                maxVal = val;
            }
        }
        System.out.println("\nMax value: " + maxVal);
        return maxVal;
    }

    static int getMin(int[] arr) {
        int minVal = arr[0];
        for (int val : arr) {
            if (val < minVal) {
                minVal = val;
            }
        }
        System.out.println("\nMin value: " + minVal);
        return minVal;
    }

    static int getSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("\nsum = " + sum);
        return sum;
    }

    static int[] getMaxMinAndSum(int[] arr) {
        int[] result = new int[3];
        result[0] = getMax(arr);
        result[1] = getMin(arr);
        result[2] = getSum(arr);

        return result;
    }

    static int[] getLarger(int[] arr1, int[] arr2) {
        int arrSum1 = getSum(arr1);
        int arrSum2 = getSum(arr2);
        System.out.println("Wieksza tablica to: "
                + (arrSum1 > arrSum2 ? "Tablica 1" : "Tablica 2"));

        return arrSum1 > arrSum2 ? arr1 : arr2; //Ternary operator. Krotsza forma if else
    }

    static int[] merge(int[] arr1, int[] arr2) {
        int[] returnArr = new int[arr1.length + arr2.length];
        for (int i = 0; i < returnArr.length; i++) {
            if (i < arr1.length) {
                returnArr[i] = arr1[i];
            } else {
                returnArr[i] = arr2[i - arr1.length];
            }
        }
        System.out.println("Zlaczone tablice to: ");
        for (int el : returnArr) {
            System.out.printf("%2d ", el); //printf to sformatowana wersja println , %2d znaczy int do dwoch znakow
        }
        System.out.println();
        return returnArr;
    }

    static int[] getDistinct(int[] arr) {
        int[] resultArr = new int[0];
        int[] dupArr = new int[0];
        for (int el : arr) {
            if (!contains(el, resultArr)) {
                resultArr = addToArrayEnd(el, resultArr);
            }else{
                dupArr = addToArrayEnd(el,dupArr);
            }
        }
        printArr(resultArr);
        System.out.println("Duplicates: ");
        printArr(dupArr);
        return resultArr;
    }

    static int[] addToArrayEnd(int val, int[] arr) {
        int[] returnArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            returnArr[i] = arr[i];
        }
        returnArr[returnArr.length - 1] = val;
        return returnArr;
    }

    static boolean contains(int num, int[] table) {
        for (int el : table) {
            if (el == num) {
                return true;
            }
        }
        return false;
    }

    static void printArr(int[] arr) {
        for (int el : arr) {
            System.out.printf("%2d ",el);
        }
        System.out.println();
    }

    public static void varG(int[] varargs) {
        for (int i : varargs) {
            System.out.print(i);
        }
    }

    // GitHub test


    public static void main(String[] args) {

//        getMax(randArray(10));
//        getMin(randArray(10));
//        getSum(randArray(10));
//        getMaxMinAndSum(randArray(10));
//        for(int el : getMaxMinAndSum(randArray(10))){
//            System.out.print(el + " ");
//        }

//        getLarger(randArray(10),randArray(10));
//        merge(randArray(5),randArray(5));
        getDistinct(randArray(20));


//
//        varG(new int[]{1,4,5,6,7,7,8});

                int myValue = 0;
                int x = 3;
                while(myValue++ < 3) {
                    int y = (1 + 2 * myValue) % 3;
                    System.out.println("   y:"+y);
                    System.out.println("   myValue:"+myValue);
                    System.out.println("   x:"+x);
                    switch(y) {
                        default:
                        case 0: x -= 1; break;
                        case 1: x += 5;
                    }
                }
                System.out.println(x);
            }

    }

