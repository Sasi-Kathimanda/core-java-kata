package streams.reducing;

import java.util.List;
import java.util.stream.IntStream;

/**
 * elements in stream can be reduced by two methods reduce(), collect().
 **/
public class StreamReduction {

    protected int getSumUsingPeek(List<Integer> ints) {
        return ints.stream().flatMapToInt(IntStream::of).peek(i -> System.out.format("%d", i)).sum();
    }

    protected int getSumUsingReduce(List<Integer> ints) {
        return ints.stream().reduce((i, n) -> i + n).get();
    }

    public int findMaxOfIntsUsingReduce(List<Integer> ints) {
        return ints.stream().reduce((i, n) -> i > n ? i : n).get();
    }

    public int findMaxUsingStreamMax(List<Integer> ints) {
        return ints.stream().mapToInt(Integer::valueOf).max().getAsInt();
    }
}