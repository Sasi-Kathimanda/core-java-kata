package generics.world;

import domain.Person;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GenericMethodTest {

    @Test
    void shouldFindMinOfGivenListOfIntegers() {
        Integer output = new GenericMethod().min(List.of(5, 3, 4), Integer::compare);
        assertEquals(3, output.intValue());
    }

    @Test
    void shouldFindMinAgeOfGivenListOfPersons() {
        List<Person> people = List.of(new Person("Sasi", 19), new Person("Kiran", 29), new Person("Raja", 9));
        Person output = new GenericMethod().min(people, new SortedByAgeComparator<>());
        assertEquals(9, output.getAge());
    }

    @Test
    void shouldThrowExceptionGivenEmptyInput() {
        assertThrows(IllegalArgumentException.class, () -> new GenericMethod().min(List.of(), Integer::compare), "list is empty");
    }

    @Test
    void shouldTransformArrayOfIntToListOfIntegers() {
        GenericMethod method = new GenericMethod();
        List<Integer> expectedList = List.of(1, 2, 3);
        Integer[] inputArray = new Integer[]{1, 2, 3};
        List<Integer> derivedList = method.toList(inputArray);
        assertEquals(3, derivedList.size());
        assertEquals(derivedList, expectedList);
    }

    @Test
    void shouldTransformArrayOfStringsToListOfStrings() {
        GenericMethod sut = new GenericMethod();
        List<String> expectedStringsList = List.of("Sasi", "Kathimanda", "Rajahmundry");
        String[] stringArray = new String[]{"Sasi", "Kathimanda", "Rajahmundry"};
        List<String> derivedList = sut.toList(stringArray);
        assertEquals(expectedStringsList, derivedList);
    }

    @Test
    void shouldTransformArrayOfIntToListOfIntegersUsingVarArgsVersion() {
        GenericMethod method = new GenericMethod();
        List<Integer> expectedList = List.of(1, 2, 3);
        List<Integer> derivedList = method.toListUsingVarArgs(1, 2, 3);
        assertEquals(derivedList, expectedList);
    }

    @Test
    void shouldTransformArrayOfStringsToListOfStringsUsingVarArgsVersion() {
        GenericMethod sut = new GenericMethod();
        List<String> expectedStringsList = List.of("Sasi", "Kathimanda", "Rajahmundry");
        List<String> derivedList = sut.toListUsingVarArgs("Sasi", "Kathimanda", "Rajahmundry");
        assertEquals(expectedStringsList, derivedList);
    }

    @Test
    void shouldAddTheAllElementsToGivenList() {
        GenericMethod sut = new GenericMethod();
        List<Integer> expectedList = List.of(1, 2, 3, 4, 5);
        Integer[] ints = new Integer[]{4, 5};
        List<Integer> derivedList = sut.addAll(List.of(1, 2, 3), ints);
        assertEquals(expectedList, derivedList);
    }

    @Test
    void shouldCopyListFromOther() {
        GenericMethod sut = new GenericMethod();
        List<Object> objs = Arrays.asList(1, 2.1, "Five");
        List<Integer> ints = Arrays.asList(3, 4);
        sut.copy(objs, ints);
        assertEquals("[3, 4, Five]", objs.toString());
    }

}