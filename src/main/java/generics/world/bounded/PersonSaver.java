package generics.world.bounded;

import domain.Person;

import java.io.IOException;
import java.io.RandomAccessFile;

public class PersonSaver {
    private final RandomAccessFile file;

    public PersonSaver(RandomAccessFile file) {
        this.file = file;
    }

    public void save(Person person) throws IOException {
        file.writeUTF(person.getClass().getName());
        file.writeUTF(",");
        file.writeUTF(person.getName());
        file.writeUTF(",");
        file.writeUTF(person.getAge()+"");
    }
}
