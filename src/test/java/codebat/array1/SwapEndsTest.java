package codebat.array1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SwapEndsTest {
    @Test
    void testSwapEnds() {
        // given
        SwapEnds swapEnds = new SwapEnds();
        int[] input = new int[] { 1, 2, 3, 4 };

        // when
        int[] swappedlist = swapEnds.swapEnds(input);

        // then
        assertEquals(4, swappedlist.length);
        assertArrayEquals(new int[] { 4, 2, 3, 1 }, swappedlist);
    }
}
