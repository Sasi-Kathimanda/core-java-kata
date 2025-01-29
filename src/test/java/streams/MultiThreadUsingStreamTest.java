package streams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.stream.IntStream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

    @Test
    void givenIntegerFindSumUsingParallelStream() {
        //given
        List<Integer> ints = IntStream.rangeClosed(1, 5)
                .boxed()
                .toList();
        int result = sut.calculateSumUsingParallelStream(ints);
        assertEquals(55, result);
    }

    @Test
    void givenFindSumUsingBothPSShouldBeLess() {
        //given
        List<Integer> ints = IntStream.rangeClosed(1, 10_000_000)
                .boxed()
                .toList();
        long longStart = System.currentTimeMillis();
        int resultUsingNormal = sut.calculateSumUsingParallelStream(ints);
        long longEnd = System.currentTimeMillis();
        long totalTimTakenForNormal = longEnd - longStart;
        System.out.println("totalTimeTakenForNormal = " + totalTimTakenForNormal);

        longStart = System.currentTimeMillis();
        int resultUsingPS = sut.calculateSumUsingStream(ints);
        longEnd = System.currentTimeMillis();
        long totalTimTakenForPS = longEnd - longStart;
        System.out.println("totalTimTakenForPS = " + totalTimTakenForPS);

        assertEquals(resultUsingNormal, resultUsingPS);
        assertTrue(totalTimTakenForPS <= totalTimTakenForNormal);
    }
}