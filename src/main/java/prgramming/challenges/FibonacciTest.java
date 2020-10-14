package prgramming.challenges;

import java.util.stream.Stream;

public class FibonacciTest {
    private final int previous;
    private final int value;
    private  static final int MAX_NUMBER = 9;
    private static final FibonacciTest SEED = new FibonacciTest(1, 1);

    FibonacciTest(int previous, int value) {
        this.previous = previous;
        this.value = value;
    }
    private FibonacciTest next() {
        return new FibonacciTest(value, value + previous);
    }

    public static void main(String[] args) {
        Stream.iterate(FibonacciTest.SEED, FibonacciTest::next)
                .limit(MAX_NUMBER)
                .forEach(System.out::println);
    }

    @Override
    public String toString() {
        return String.valueOf(previous);
    }
}
