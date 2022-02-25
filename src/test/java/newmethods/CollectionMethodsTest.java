package newmethods;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

class CollectionMethodsTest {

    @Test
    void comparingShouldSortTheListByNaturalOrder() {
        List<String> names = Arrays.asList("Anne", "Kiran", "Barbara");
        names.sort(Comparator.comparing(Function.identity()));
        assertEquals("[Anne, Barbara, Kiran]", names.toString());
    }

}