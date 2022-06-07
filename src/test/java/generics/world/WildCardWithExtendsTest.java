package generics.world;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class WildCardWithExtendsTest {

    @Test
    void addShouldAddBothIntegerAndDoubles() {
        List<Number> nums = new ArrayList<>();
        nums.add(1);
        nums.add(1.1);
        assertEquals(nums.toString(), "[1, 1.1]");
    }

    @Test
    void addAllCanAddIntAndDoublesList() {
        List<Number> nums = new ArrayList<>();
        List<Integer> ints = List.of(1,2,3);
        List<Double> doubles = List.of(1.1,2.2,3.3);
        //nums.add(ints); //cannot use add List<Integer> is not a subtype of Number
        nums.addAll(ints);
        nums.addAll(doubles);
        assertEquals(nums.toString(),"[1, 2, 3, 1.1, 2.2, 3.3]");
    }
}