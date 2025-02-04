package streams.collect;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StreamsCompareTest {
    private final List<String> list1 = Arrays.asList("banana", "ORANGE", "mango");
    private final List<String> list2 = List.of("banana", "orange", "mango");
    StreamsCompare streamsCompare = new StreamsCompare();

    @Test
    void givenTwoListOfStringsCheckTheyAreEqual() {
        //when
        assertTrue(streamsCompare.compareList(list1, list2));
    }

    @Test
    void compareListWithHavingNulls() {
        //given
        var list1 = Arrays.asList("banana", null, "ORANGE", "mango");
        var list2 = Arrays.asList(null, "banana", "orange", "mango");
        //when
        assertTrue(streamsCompare.compareListWithHavingNulls(list1, list2));
    }
}