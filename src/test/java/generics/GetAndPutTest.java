package generics;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class GetAndPutTest {

    @Test
    void getTheValueOutOfStructure() {
        GetAndPut sut = new GetAndPut();
        //Can give List<Integer>
        double actual = sut.sum(List.of(1, 2, 3, 4, 5));
        assertEquals(15.0, actual);

        //Can give List<Double>
        actual = sut.sum(List.of(1.0, 2.0, 3.0, 4.1, 5.0));
        assertEquals(15.1, actual);

        //Can give List<Number>
        actual = sut.sum(List.of(1, 2, 3.0, 4.2, 5));
        assertEquals(15.2, actual);

    }

    @Test
    void putTheValueIntoTheStructure() {
        GetAndPut sut = new GetAndPut();
        List<Integer> nums = new ArrayList<>();
        sut.count(nums, 5);
        assertEquals("[0, 1, 2, 3, 4]", nums.toString());
    }

}