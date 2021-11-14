package generics.world;

import domain.Person;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SortingExampleTest {

    @Test
    void sortByAgeShouldSortListByAgeAscending() {
        List<Person> people = List.of(new Person("Sasi", 26), new Person("Kiran", 37), new Person("Raja", 19));
        List<Person> sortedPeopleByAge = List.of(new Person("Raja", 19), new Person("Sasi", 26), new Person("Kiran", 37));

        List<Person> expectedPeople = new SortingExample().sortByAge(people);
        assertEquals(3, expectedPeople.size());
        assertEquals(sortedPeopleByAge, expectedPeople);
    }
}