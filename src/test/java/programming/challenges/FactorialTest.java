package programming.challenges;

import org.junit.jupiter.api.Test;
import java.math.BigInteger;
import static org.junit.jupiter.api.Assertions.assertEquals;


class FactorialTest {
    private final BigInteger hundredFactorial = new BigInteger("93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000");

    @Test
    void findFactorialForAVeryLargeNumber() {
        Factorial factorial = new Factorial();
        BigInteger actualResult = factorial.findFactorialForAVeryLargeNumber(100);
        assertEquals(hundredFactorial.toString(), actualResult.toString());
    }

}