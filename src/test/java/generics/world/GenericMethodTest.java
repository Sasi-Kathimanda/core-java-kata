package generics.world;

import domain.Person;
import org.junit.jupiter.api.Test;

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
        Integer[] inputArray = new Integer[]{1, 2, 3};
        List<Integer> derivedList = method.toListUsingVarArgs(inputArray);
        assertEquals(derivedList, expectedList);
    }

}