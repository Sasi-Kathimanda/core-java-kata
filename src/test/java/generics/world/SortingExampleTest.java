package generics.world;

import domain.Person;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SortingExampleTest {

    List<Person> people = Arrays.asList(new Person("Sasi", 26), new Person("Kiran", 37), new Person("Raja", 19));
    List<Person> sortedPeopleByAge = Arrays.asList(new Person("Raja", 19), new Person("Sasi", 26), new Person("Kiran", 37));
    List<Person> sortedPeopleByAgeDesc = Arrays.asList(new Person("Kiran", 37), new Person("Sasi", 26), new Person("Raja", 19));

    @Test
    void sortByAgeShouldSortListByAgeAscendingForUnorderedList() {
        List<Person> expectedPeople = new SortingExample().sortByAge(people);
        assertEquals(3, expectedPeople.size());
        assertEquals(expectedPeople, sortedPeopleByAge);
    }

    @Test
    void shouldSortByAgeReturnSameGivenAlreadySortedList() {
        assertEquals(sortedPeopleByAge, new SortingExample().sortByAge(sortedPeopleByAge));
    }

    @Test
    void shouldReturnZeroListWhenInputIsEmpty() {
        assertEquals(0, new SortingExample().sortByAge(Arrays.asList()).size());
    }

    @Test
    void reverseComparatorShouldSortTheAgeByDesc() {
        assertEquals(sortedPeopleByAgeDesc, new SortingExample().sortByAgeDesc(people));
    }

}