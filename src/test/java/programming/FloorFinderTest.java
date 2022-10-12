package programming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FloorFinderTest {

    @Test
    void floorFindForGivenLargeString() {
        FloorFinder finder = new FloorFinder();
        var result = finder.findFloor("((()");
        assertEquals(2, result);

        result = finder.findFloor("(((((())))((((((((((()()()()()))()((((((()))))))))))((((()))))))))))))))(((((((((((((()()()()()()()()()()()()()((((((((()");
        assertEquals(17, result);

//        result = finder.findFloor("(((((((())((((((((((((((((((((");
//        assertEquals(14, result);
    }


}