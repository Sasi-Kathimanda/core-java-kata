package lambda;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ConditionalLambdaTest {
    private final List<Person> persons = List.of(
            new Person("person1", 18),
            new Person("person2", 76),
            new Person("person3", 23),
            new Person("person4", 12));

    @Test
    void givenListOfIntFindPersonsCountWithAgeGreaterThanANumber() {
        assertEquals(1, new ConditionalLambda().findPersons(persons, persons -> persons.getAge() > 75).size());
        assertEquals(3, new ConditionalLambda().findPersons(persons, persons -> persons.getAge() > 12).size());
    }

}