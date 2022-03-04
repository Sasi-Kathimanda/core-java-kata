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
        List<Integer> ints = new ArrayList<>();
        sut.count(ints, 5);
        assertEquals("[0, 1, 2, 3, 4]", ints.toString());

        //Can give Number as it is super of Integer
        List<Number> nums = new ArrayList<>();
        sut.count(nums, 3);
        nums.add(3.0);
        assertEquals("[0, 1, 2, 3.0]", nums.toString());


        //Can give Object as it is super of Integer
        List<Object> objs = new ArrayList<>();
        sut.count(objs, 3);
        objs.add(3.0);
        objs.add("four");
        assertEquals("[0, 1, 2, 3.0, four]", objs.toString());
    }

    @Test
    void GetAndPutTheValuesIntoTheStructure() {
        GetAndPut sut = new GetAndPut();
        List<Integer> ints = new ArrayList<>();
        double result = sut.sumCount(ints, 5);
        assertEquals(10, result);
    }
}