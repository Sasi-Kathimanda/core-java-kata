package generics.world;

import java.util.Comparator;

/**
 *  Passing a parameter to generic type
 * @param <T>
 */
public class ReverseComparator<T> implements Comparator<T> {
    private final Comparator<T> delegateComparator;

    public ReverseComparator(Comparator<T> delegateComparator) {
        this.delegateComparator = delegateComparator;
    }

    @Override
    public int compare(T o1, T o2) {
        return -1 * delegateComparator.compare(o1, o2);
    }
}
