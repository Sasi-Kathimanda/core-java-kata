package generics.world;

import java.util.Comparator;
import java.util.List;

public class GenericMethod {

    public <T> T min(List<T> objects, Comparator<T> comparator) {
        if (objects.isEmpty()) {
            throw new IllegalArgumentException("list is empty ");
        }

        return objects.get(0);
    }
}
