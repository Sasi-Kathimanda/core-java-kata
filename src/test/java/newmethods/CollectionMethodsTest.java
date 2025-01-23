package newmethods;

import lambda.Person;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CollectionMethodsTest {

    @Test
    void comparingShouldSortTheListByNaturalOrder() {
        //Given
        CollectionMethods sut = new CollectionMethods();
        List<String> names = Arrays.asList("Anne", "Kiran", "Barbara", "123");

        //When
        sut.sort(names);
        assertEquals("[123, Anne, Barbara, Kiran]", names.toString());
    }

    @Test
    void usingReplaceAllToCapitaliseAllKeys() {
        CollectionMethods sut = new CollectionMethods();
        //Given
        Person p3 = new Person("raja", 39);
        Person p2 = new Person("kiran", 29);
        Person p1 = new Person("sasi", 19);

        //When
        List<Person> persons = Arrays.asList(p3, p2, p1);
        sut.toCaps(persons);
        assertEquals("RAJA", persons.get(0).getName());
        assertEquals(39, persons.get(0).getAge());

        assertEquals("KIRAN", persons.get(1).getName());
        assertEquals(29, persons.get(1).getAge());

        assertEquals("SASI", persons.get(2).getName());
        assertEquals(19, persons.get(2).getAge());
    }

    @Test
    void comparingShouldSortByAge() {
        CollectionMethods sut = new CollectionMethods();
        //Given
        Person p3 = new Person("raja", 39);
        Person p2 = new Person("kiran", 29);
        Person p1 = new Person("sasi", 19);

        //When
        List<Person> persons = Arrays.asList(p3, p2, p1);
        sut.sortByAge(persons);

        //Then
        assertEquals(3, persons.size());
        assertEquals(19, persons.get(0).getAge());
        assertEquals(29, persons.get(1).getAge());
        assertEquals(39, persons.get(2).getAge());
    }

}