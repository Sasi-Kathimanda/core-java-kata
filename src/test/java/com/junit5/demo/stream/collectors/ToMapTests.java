package com.junit5.demo.stream.collectors;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ToMapTests {

    @Test
    @DisplayName("listToMapUsingToMap")
    void listToMapUsingToMap() {
        List<String> namesList = List.of("Sasi", "Kiran", "Raja");
        Map<Integer, String> namesMap = namesList
                .stream()
                .collect(Collectors.toMap(namesList::indexOf, Function.identity()));
        assertEquals(3, namesMap.size());
        assertEquals("Sasi", namesMap.get(0));
        assertEquals("Kiran", namesMap.get(1));
        assertEquals("Raja", namesMap.get(2));
    }
}
