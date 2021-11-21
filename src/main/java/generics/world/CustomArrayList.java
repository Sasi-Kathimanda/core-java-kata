package generics.world;

import java.util.AbstractList;

public class CustomArrayList<T> extends AbstractList<T> {

    private final T[] values;

    public CustomArrayList(T[] values) {
        this.values = values;
    }

    @Override
    public T get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public boolean add(T o) {
        T[] newValues = (T[]) new Object[size() + 1];
        for (int i = 0; i < values.length; i++) {
                newValues[i] = values[i];
        }
        newValues[size()] = o;
        return true;
    }
}
