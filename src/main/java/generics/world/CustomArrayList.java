package generics.world;

import java.util.AbstractList;

public class CustomArrayList extends AbstractList {

    private final Object[] values;

    public CustomArrayList(Object[] values) {
        this.values = values;
    }

    @Override
    public Object get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public boolean add(Object o) {
        Object[] newValues = new Object[size() + 1];
        for (int i = 0; i < values.length; i++) {
                newValues[i] = values[i];
        }
        newValues[size()] = o;
        return true;
    }
}
