package generics.world;

import java.util.Comparator;
import java.util.List;

public class GenericMethod {

    public <T> T min(List<T> objects , Comparator<T> comparator) {

        return objects.get(0);
    }
}
