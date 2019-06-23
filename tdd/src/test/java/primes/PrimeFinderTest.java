package primes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFinderTest {

    @ParameterizedTest
    @ValueSource(ints = {2,3,4,6})
    public void trueIfCorrectLength(int param){
        PrimeFinder pf = new PrimeFinder();

        int[] resultArr = pf.getPrimes(param);

        assertEquals(param, resultArr.length);
    }

    @ParameterizedTest
    @ValueSource(ints = {5,10,15,2460})
    public void trueIfAllPrimes(int param){
        PrimeFinder pf = new PrimeFinder();

        int[] resultArr = pf.getPrimes(param);
        boolean result = true;

        for(int num : resultArr){
            if(!(new PrimeTester().isPrime(num))){
                result = false;
            }
        }

        Arrays.stream(resultArr).forEach(System.out::println);

        assertTrue(result);
    }

}