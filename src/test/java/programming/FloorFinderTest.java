package programming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FloorFinderTest {

    @Test
    void floorFindForGivenLargeString() {
        FloorFinder finder = new FloorFinder();
        // var result = finder.findFloor("(((((())))((((((((((()()()()()))()((((((()))))))))))((((()))))))))))))))(((((((((((((()()()()()()()()()()()()()((((((((()");
        var result = finder.findFloor("((()");
        assertEquals(2, result);
    }


}