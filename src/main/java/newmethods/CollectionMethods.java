package newmethods;

import lambda.Person;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class CollectionMethods {

    public void sort(List<String> names) {
        names.sort(Comparator.comparing(Function.identity()));
    }

    public void toCaps(List<Person> persons) {
        persons.replaceAll(p -> new Person(p.getName().toUpperCase(), p.getAge()));
    }

    public void sortByAge(List<Person> persons) {
        persons.sort(Comparator.comparing(Person::getAge));
    }
}
