package generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VariantTypesTest {

    @Test
    void add() {
        VariantTypes variantTypes = new VariantTypes();
        Integer[] ints = new Integer[]{1, 2, 3};
        assertThrows(ArrayStoreException.class, () -> variantTypes.add(ints));
        //assertEquals(1.0, Optional.ofNullable(ints[0]));
    }
}