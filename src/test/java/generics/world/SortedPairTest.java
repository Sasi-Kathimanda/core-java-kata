package generics.world;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortedPairTest {

    @Test
    void shouldRetainThePairWhenTheOrderIsSame() {
        SortedPair pair = new SortedPair(3, 4);
        assertEquals(3, pair.getLeft());
        assertEquals(4, pair.getRight());
    }

    @Test
    void shouldSwapThePairWhenThereIsMisorder() {
        SortedPair pair = new SortedPair(5, 4);
        assertEquals(4, pair.getLeft());
        assertEquals(5, pair.getRight());
    }

}