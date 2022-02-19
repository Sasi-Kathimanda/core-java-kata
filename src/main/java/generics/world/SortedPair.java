package generics.world;

/**
 * Bounded Type , i.e, any type that implements comparable interface could be
 * able to use this class.
 *
 * @param <T>
 */
public class SortedPair<T extends Comparable<T>> {
    private final T first;
    private final T second;

    public SortedPair(T left, T right) {
        if (left.compareTo(right) < 0) {
            this.first = left;
            this.second = right;
        } else {
            this.first = right;
            this.second = left;
        }
    }

    public T getLeft() {
        return first;
    }

    public T getRight() {
        return second;
    }
}
