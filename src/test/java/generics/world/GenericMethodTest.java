package generics.world;

import domain.Person;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}