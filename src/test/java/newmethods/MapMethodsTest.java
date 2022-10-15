package newmethods;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    void computeIfAbsentRethrowExceptionWhenMappingFunctionThrowsException() {
        var stringLength = new HashMap<>();
        var map = new MapMethods<>();
        assertThrows(RuntimeException.class, () -> map.computeIfAbsent(stringLength, "Sasi", s -> {
            throw new RuntimeException();
        }));
    }

    @Test
    void mergeMapWhenKeyHasNonNullValue() {
        Map<String, Integer> stringLength = new HashMap<>();
        stringLength.put("Sasi", 20);
        var actualValue = new MapMethods<String, Integer>().merge(stringLength, "Sasi", 10, (oldValue, newValue) -> oldValue / newValue);
        assertEquals(2, actualValue);
    }

    @Test
    void mergeMapWhenKeyIsDuplicated() {

    }

    @Test
    void mergeMapWhenMappingTwoHashMaps() {

    }
}