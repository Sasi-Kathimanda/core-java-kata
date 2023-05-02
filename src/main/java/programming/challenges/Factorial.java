package programming.challenges;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        //System.out.println(findFactorialForAVeryLargeNumber(100));
        //System.out.println(findFactorialForAVeryLargeNumberSimplified(100));
        //System.out.println(findFactorial(100));
    }

    protected BigInteger findFactorialForAVeryLargeNumber(int input) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = input - 1; input > input - i; i--) {
            factorial = factorial.add(factorial.multiply(BigInteger.valueOf(i)));
        }
        return factorial;
    }

    private static int findFactorial(int input) {
        int factorial = 1;
        for (int i = input - 1; input > input - i; i--) {
            factorial += factorial * i;
        }
        return factorial;
    }

    private static BigInteger findFactorialForAVeryLargeNumberSimplified(int input) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = 2; i <= input; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
}
