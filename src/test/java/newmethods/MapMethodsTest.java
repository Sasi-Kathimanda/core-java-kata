package newmethods;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class MapMethodsTest {

    @Test
    void computeIfAbsentWhenKeyHasNonNullValue() {
        Map<String, Integer> stringLength = new HashMap<>();
        stringLength.put("Sasi", 10);
        var actualValue = new MapMethods<String, Integer>().computeIfAbsent(stringLength, "Sasi", String::length);
        assertEquals(10, actualValue);
    }

    @Test
    void computeIfAbsentTriggersMappingFunctionONLYWhenKeyIsNotPresentOrHasNullValue() {
        Map<String, Integer> stringLength = new HashMap<>();
        stringLength.put("Sasi", 10);
        var actualValue = new MapMethods<String, Integer>().computeIfAbsent(stringLength, "Kiran", String::length);
        assertEquals(5, actualValue); //here the mapping function is executed ONLY when the Key is not matched
    }

    @Test
    void computeIfAbsentReturnsNoMappingWhenMappingFunctionReturnsNull() {
        Map<String, Integer> stringLength = new HashMap<>();
        var actualValue = new MapMethods<String, Integer>().computeIfAbsent(stringLength, "Sasi", s -> null);
        assertEquals(null, actualValue); // returns null
        assertNull(stringLength.get("Sasi")); // records no mapping
    }
}