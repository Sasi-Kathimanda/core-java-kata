package streams.reducing;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StreamReductionTest {
    private final List<Integer> ints = List.of(1, 2, 3, 4, 5);

    @Test
    void givenListOfIntsFindSumUsingPeek() {
        assertEquals(15, new StreamReduction().getSumUsingPeek(ints));
    }

    @Test
    void givenListOfIntsFindSumUsingReduce() {
        assertEquals(15, new StreamReduction().getSumUsingReduce(ints));
    }

    @Test
    void givenListOfIntsFindMaxUsingReduce() {
        assertEquals(5, new StreamReduction().findMaxOfIntsUsingReduce(ints));
    }

    @Test
    void givenListOfIntsFindMaxUsingStreamSum() {
        assertEquals(5, new StreamReduction().findMaxUsingStreamMax(ints));
    }
}