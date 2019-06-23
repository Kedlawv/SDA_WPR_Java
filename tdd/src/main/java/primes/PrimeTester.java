package primes;

public class PrimeTester {

    public boolean isPrime(int num) {

        if(num < 2 ){
            return false;
        }

        boolean result = true;
        for(int i = 2; i <= num/2; ++i)
        {
            if(num % i == 0)
            {
                result = false;
                break;
            }
        }

        return result;


    }
}
