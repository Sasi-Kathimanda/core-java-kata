package generics.world;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomArrayListTest {
    @Test
    void shouldStoreTheElements() {
        Integer[] ints = new Integer[]{1, 2};
        CustomArrayList<Integer> arrayList = new CustomArrayList<>(ints);
        arrayList.add(1);
        arrayList.add(2);
        assertEquals(2, arrayList.size());
        assertEquals(1, arrayList.get(0));
        assertEquals(2, arrayList.get(1));

    }
}