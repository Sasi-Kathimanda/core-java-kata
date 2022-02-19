package generics.world;

import java.util.Comparator;
import java.util.List;

public class GenericMethod {
    /**
     *
     * @param objects list of any objects
     * @param comparator any T that implements comparator interface
     * @param <T> any type T
     * @return
     */
    public <T> T min(List<T> objects, Comparator<T> comparator) {
        if (objects.isEmpty()) {
            throw new IllegalArgumentException("list is empty ");
        }
        var lowestElement = objects.get(0);

        for (T t : objects) {
            if (comparator.compare(t, lowestElement) < 0) {
                lowestElement = t;
            }
        }

        return lowestElement;
    }
}
