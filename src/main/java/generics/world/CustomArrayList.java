package generics.world;

import java.util.AbstractList;

public class CustomArrayList extends AbstractList {
    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean add(Object o) {
        return true;
    }
}
