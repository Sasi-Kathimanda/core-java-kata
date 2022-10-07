package newmethods;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MapMethodsTest {

    @Test
    void computeIfAbsentWhenKeyHasNonNullValue() {
        Map<String, Integer> stringLength = new HashMap<>();
        stringLength.put("Sasi", 4);
        var actualValue = new MapMethods<String, Integer>().computeIfAbsent(stringLength, "Sasi", String::length);
        assertEquals(4, actualValue);
    }
}