package generics.world;

/**
 *  Bounded Type , i.e, any type that implements comparable interface could be
 *  able to use this class.
 * @param <T>
 */
public class SortedPair<T extends Comparable<T>> {
    private final T left;
    private final T right;

    public SortedPair(T left, T right) {
        if (right.compareTo(left) < 0) {
            this.left = right;
            this.right = left;
        } else {
            this.left = left;
            this.right = right;
        }
    }

    public T getLeft() {
        return left;
    }

    public T getRight() {
        return right;
    }
}
