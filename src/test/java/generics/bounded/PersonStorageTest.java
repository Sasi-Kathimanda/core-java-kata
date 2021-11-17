package generics.bounded;

import domain.Employee;
import domain.Partner;
import domain.Person;
import generics.world.bounded.PersonLoader;
import generics.world.bounded.PersonSaver;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonStorageTest {
    private Partner partner1 = new Partner("Sasi", 19);
    private Employee employee = new Employee("Kiran", 29);
    private Partner partner2 = new Partner("Raja", 9);
    private File file;
    private PersonLoader loader;
    private PersonSaver saver;

    @Test
    void saveAndLoadPerson() throws IOException {
        Person person = new Person("Sas", 3);
        saver = new PersonSaver(new RandomAccessFile("build/xyz", "rw"));
        loader = new PersonLoader(new RandomAccessFile("build/xyz", "rw"));
        saver.save(person);
        assertEquals(person, loader.load());
    }
}
