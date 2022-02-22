package generics.world;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WildCardWithExtendsTest {

    @Test
    void addShouldAddBothIntegerAndDoubles() {
        List<Number> nums = new ArrayList<>();
        nums.add(1);
        nums.add(1.1);
        assertEquals(nums.toString(), "[1, 1.1]");
    }
}