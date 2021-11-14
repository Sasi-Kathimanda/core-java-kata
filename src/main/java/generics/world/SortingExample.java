package generics.world;

import domain.Person;

import java.util.List;

public class SortingExample {

    public List<Person> sortByAge(List<Person> people) {
        people.sort(new SortedByAgeComparator<>());
        return people;
    }
}
