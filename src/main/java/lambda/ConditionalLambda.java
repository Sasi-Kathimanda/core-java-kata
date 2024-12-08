package lambda;

import java.util.ArrayList;
import java.util.List;

public class ConditionalLambda {

    public List<Person> findPersons(List<Person> persons, Searchable searchable) {
        List<Person> searchedPersons = new ArrayList<>();
        for (Person person : persons) {
            if (searchable.test(person)) {
                searchedPersons.add(person);
            }
        }
        return searchedPersons;
    }

    @FunctionalInterface
    interface Searchable {
        boolean test(Person person);
    }
}
