package generics.bounded;

import domain.Employee;
import domain.Partner;
import domain.Person;
import generics.world.bounded.PersonLoader;
import generics.world.bounded.PersonSaver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonStorageTest {
    private Partner partner1 = new Partner("Sasi", 19);
    private Employee employee = new Employee("Kiran", 29);
    private Partner partner2 = new Partner("Raja", 9);
    private File file;
    private PersonLoader loader;
    private PersonSaver saver;

    @Test
    void saveAndLoadPerson() throws Exception {
        Person person = new Person("Sas", 5);
        saver.save(person);
        assertEquals(person, loader.load());
    }

    @Test
    void saveAndLoadArraysOfPeople() throws ClassNotFoundException, IOException {
        Person[] people = new Person[2];
        people[0] = new Person("Sasi", 1);
        people[1] = new Employee("Kiran", 2);
        saver.saveAll(people);
        assertEquals(people[0], loader.load());
        assertEquals(people[1], loader.load());
    }

    @BeforeEach
    public void setUp() throws Exception {
        file = File.createTempFile("build/tmp", "people");
        saver = new PersonSaver(file);
        loader = new PersonLoader(file);
    }

    @AfterEach
    public void tearDown() {
        if (file.exists()) {
            file.delete();
        }
    }
}
