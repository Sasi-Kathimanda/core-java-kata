package streams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiThreadUsingStreamTest {
    MultiThreadUsingStream sut;

    @BeforeEach
    void setUp() {
        sut = new MultiThreadUsingStream();
    }

    @Test
    void givenIntegersFindSumUsingStream() {
        //given
        List<Integer> ints = IntStream.rangeClosed(1, 1_000_000)
                .boxed()
                .toList();
        int result = sut.calculateSumUsingStream(ints);
        assertEquals(1784293664, result);
    }

    @Test
    void givenIntegerFindSumUsingParallelStream() {
        //given
        List<Integer> ints = IntStream.rangeClosed(1, 1_000_000)
                .boxed()
                .toList();
        int result = sut.calculateSumUsingParallelStream(ints);
        assertEquals(1784293664, result);
    }
}