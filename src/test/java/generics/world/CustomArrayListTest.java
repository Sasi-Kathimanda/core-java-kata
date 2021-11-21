package generics.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CustomArrayListTest {

    private final CustomArrayList arrayList = new CustomArrayList();

    @Test
    void shouldStoreTheElements() {
        arrayList.add(1);
        arrayList.add(2);
        Assertions.assertEquals(2, arrayList.size());
    }
}