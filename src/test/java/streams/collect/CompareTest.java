package streams.collect;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CompareTest {
    private final List<String> list1 = List.of("banana", "ORANGE", "mango");
    private final List<String> list2 = List.of("banana", "orange", "mango");
    Compare compare = new Compare();

    @Test
    void givenTwoListOfStringsCheckTheyAreEqual() {
        //when
        assertTrue(compare.compareList(list1, list2));

    }
}