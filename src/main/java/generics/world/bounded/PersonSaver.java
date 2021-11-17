package generics.world.bounded;

import domain.Person;

import java.io.RandomAccessFile;

public class PersonSaver {
    private final RandomAccessFile file;

    public PersonSaver(RandomAccessFile file) {
        this.file = file;
    }

    public void save(Person person) {

    }
}
