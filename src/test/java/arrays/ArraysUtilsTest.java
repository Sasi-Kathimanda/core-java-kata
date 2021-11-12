package arrays;

import domain.Person;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArraysUtilsTest {

    @Test
    void addShouldAddElementsToArray() {

        ArraysUtils utils = new ArraysUtils();
        Person p1 = new Person("Sasi", 10);
        Person p2 = new Person("Kiran", 20);

        Person[] people = {p1, p2};
        Person p3 = new Person("Raja", 30);
        Person[] updatedPeople = utils.add(p3, people);
        assertEquals(3, updatedPeople.length);
        System.out.println("people = " + Arrays.toString(updatedPeople));
    }

}