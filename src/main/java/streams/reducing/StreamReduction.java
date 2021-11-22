package streams.reducing;

import java.util.List;
import java.util.stream.IntStream;

/**
 * elements in stream can be reduced by two methods reduce(), collect()
 */
public class StreamReduction {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //finding max using  streams reduce
        System.out.println("finding max using stream's reduce");
        System.out.println(intStream.reduce((i, n) -> i > n ? i : n));
        //System.out.println(intStream.reduce((i,n) -> Math.max(i, n))); // replacing Math.max
        //System.out.println(intStream.reduce(Math::max)); // replacing Lambda Method Reference


        // finding sum using Streams sum method
        System.out.println("finding sum using stream's sum");
        intStream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(intStream.sum());

    }

    protected int getSumUsingPeek(List<Integer> ints) {
        return ints.stream().flatMapToInt(IntStream::of).peek(i -> System.out.format("%d", i)).sum();
    }

    protected int getSumUsingReduce(List<Integer> ints) {
        return ints.stream().reduce((i, n) -> i + n).get();
    }

    public int findSumUsingReduce(List<Integer> ints) {
        return ints.stream().reduce((i, n) -> i > n ? i : n).get();
    }

    public int findSumUsingStreamSum(List<Integer> ints) {
        return 0;
    }
}