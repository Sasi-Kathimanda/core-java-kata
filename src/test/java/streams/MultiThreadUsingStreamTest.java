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
        List<Integer> ints = IntStream.rangeClosed(1, 5)
                .boxed()
                .toList();
        int result = sut.calculateSumUsingStream(ints);
        assertEquals(55, result);
    }
}