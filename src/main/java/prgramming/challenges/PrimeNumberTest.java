package prgramming.challenges;

import java.util.stream.IntStream;

public class PrimeNumberTest {
    public static void main(String[] args) {
        checkPrimeNumber(3);
//        findPrimaryNumbersUpTo(100);
    }

    private static void checkPrimeNumber(int input) {
        IntStream.rangeClosed(2,input/2)
                .forEach( x -> System.out.println("x = "+x+";input/x = " + input/x+";input%x ==0 ->"+(input%x==0)));
    }

    private static void findPrimaryNumbersUpTo(int input) {
        IntStream.iterate(1, n -> n+1)
                .limit(input).forEach(t-> System.out.println("t = " + input));
    }
}
