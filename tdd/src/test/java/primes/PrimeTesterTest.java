package primes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import primes.PrimeTester;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTesterTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 7919})
    public void trueIfPrime(int num) {
        PrimeTester pt = new PrimeTester();

        boolean result = pt.isPrime(num);

        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {-234, -1, 0, 1, 4, 6, 8, 9, 10, 12, 15, 16, 18, 20, 21, 22, 24, 10000})
    public void falseIfNotPrime(int num) {
        PrimeTester pt = new PrimeTester();

        boolean result = pt.isPrime(num);

        assertFalse(result);

    }
}