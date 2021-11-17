package generics.world.bounded;

import domain.Person;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class PersonLoader {
    private RandomAccessFile file;

    public PersonLoader(final RandomAccessFile file) throws FileNotFoundException {
        this.file = new RandomAccessFile("build/xyz", "rw");
    }

    public Person load() throws IOException {
        List<String> read = Files.readAllLines(Path.of("build/xyz"), StandardCharsets.UTF_8);
        var result = read.get(1).replaceAll("[^ -~]", "").split(",");
        return new Person(result[1], Integer.parseInt(result[2]));
    }
}
