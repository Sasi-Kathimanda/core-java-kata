package programming.challenges;

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
//        Stream.iterate(FibonacciTest.SEED, FibonacciTest::next)
//                .limit(MAX_NUMBER)
//                .forEach(System.out::println);

//        usingStreamIterate(9);

        System.out.println( Stream.iterate(new long[]{1, 1}, f -> new long[]{f[1], f[0] + f[1]})
                .limit(9)
                .reduce((a, b) -> b)
                .get()[0]);
    }

    @Override
    public String toString() {
        return String.valueOf(previous);
    }

    public static void usingStreamIterate(int input) {
        Stream.iterate(new int[]{0,1,}, t -> new int[]{t[1],t[0]+t[1]})
                .limit(input)
                .map(t -> t[1])
                .forEach( t -> System.out.println(t));

    }

}
