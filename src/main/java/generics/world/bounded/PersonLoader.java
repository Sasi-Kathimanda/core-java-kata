package generics.world.bounded;

import domain.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class PersonLoader {
    private RandomAccessFile file;

    public PersonLoader(final File file) throws FileNotFoundException {
        this.file = new RandomAccessFile(file,"rw");
    }

    public Person load() {
        return null;
    }
}
