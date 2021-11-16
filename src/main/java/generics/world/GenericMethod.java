package generics.world;

import java.util.Comparator;
import java.util.List;

public class GenericMethod {

    public <T> T min(List<T> objects, Comparator<T> comparator) {
        if (objects.isEmpty()) {
            throw new IllegalArgumentException("list is empty ");
        }
        T lowestElement = objects.get(0);

        for (T t : objects) {
            if (comparator.compare(t, lowestElement) < 0) {
                lowestElement = t;
            }
        }

        return lowestElement;
    }
}
