package primes;

public class PrimeFinder {

    public int[] getPrimes(int n) {
        int[] arr = new int[n];
        for(int i = 0, j = 0; j < arr.length; i++){
            if(new PrimeTester().isPrime(i)){
                arr[j] = i;
                j++;
            }
        }


        return arr;
    }
}
