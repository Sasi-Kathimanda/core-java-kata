package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConditionalLambda {

    public static void main(String[] args) {
        List<Person> persons =
            Arrays.asList(
                new Person("person1", 18),
                new Person("person2", 76),
                new Person("person3", 23),
                new Person("person4", 12));

        List<Person> personsWithAgeGT75 = findPersons(persons, car -> car.getAge() > 75);
        List<Person> personsWithAgeGT18 = findPersons(persons, car -> car.getAge() > 18);
        System.out.println(personsWithAgeGT75.stream().peek(s -> System.out.println("**" + s.name)).count());
        System.out.println(personsWithAgeGT18.stream().peek(s -> System.out.println("**" + s.name)).count());
    }

    private static List<Person> findPersons(List<Person> persons, Searchable searchable) {
        List<Person> searchedPersons = new ArrayList<>();
        for (Person person : persons) {
            if (searchable.test(person)) {
                searchedPersons.add(person);
            }
        }
        return searchedPersons;
    }


    interface Searchable {
        boolean test(Person p);
    }
    private static class Person {
        String name;
        int age;

        private Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        private int getAge() {
            return age;
        }
    }
}
