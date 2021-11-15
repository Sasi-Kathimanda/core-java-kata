package generics.world;

public class SortedPair<T extends Comparable> {
    private final T left;
    private final T right;

    public SortedPair(T left, T right) {
        this.left = left;
        this.right = right;
    }

    public T getLeft() {
        return left;
    }

    public T getRight() {
        return right;
    }
}
