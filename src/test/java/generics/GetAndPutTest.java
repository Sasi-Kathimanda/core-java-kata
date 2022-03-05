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

        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        List<? extends Number> nums = ints;
        assertEquals(1, nums.get(0));
        assertEquals(3.0, sut.sum(nums));
        // WARNING
        //nums.add(3.0) or nums.add(3) you cannot add to the structure as it uses extends
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

        List<Object> list = new ArrayList<>();
        list.add(1.0);
        list.add("Two");
        List<? super Integer> integers = list;
        integers.add(3);
        assertEquals(3, list.size());
        //WARNING : cannot use the get from wildcard super as sum of ints contains string is no sense
        // double d1 = sut.sum(integers); // Compile Error

    }

    @Test
    void GetAndPutTheValuesIntoTheStructure() {
        GetAndPut sut = new GetAndPut();
        List<Number> nums = new ArrayList<>();
        double result = sut.sumCount(nums, 5);
        assertEquals(10, result);
    }
}