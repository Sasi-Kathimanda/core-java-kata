package prgramming.challenges;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumberTest {
    public static void main(String[] args) {
        System.out.println(checkPrimeNumber(5));
        System.out.println(findPrimaryNumbersUpTo(100));
    }

    private static boolean checkPrimeNumber(int input) {
        if (input == 1) return false;
        return isPrime(input);
    }

    private static boolean isPrime(int input) {
        return IntStream.rangeClosed(2, input / 2)
                .noneMatch(i -> (input % i == 0));
    }

    private static List<Integer> findPrimaryNumbersUpTo(int input) {
        return IntStream.rangeClosed(2, input)
                        .filter(PrimeNumberTest::isPrime)
                        .boxed()
                        .collect(Collectors.toList());
    }
}
