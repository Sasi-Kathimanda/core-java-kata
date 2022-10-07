package newmethods;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}