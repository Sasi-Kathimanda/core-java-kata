package arrays;

import domain.Person;
import java.util.Arrays;

public class ArraysUtils {

    public Person[] add(Person person, Person[] persons) {
        Person[] temp = Arrays.copyOf(persons, persons.length + 1);
        temp[persons.length ] = person;
        return temp;
    }

}
