package enums;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EnumMap;
import java.util.List;

class EnumMapsTest {
    EnumMaps sut;

    @BeforeEach
    void setUp() {
        sut = new EnumMaps();
    }

    @Test
    void GivenEnum_CreateEnumMap() {
        EnumMap<DaysOfTheWeek, String> actualEnumMap = sut.of(DaysOfTheWeek.MONDAY, "Yoga");
        Assertions.assertEquals(1, actualEnumMap.size());
    }

    @Test
    void GivenEnums_CreateEnumMap() {
        List<String> activities = List.of("Yoga","Boxing", "Pilate","Swimming","Running");
        EnumMap<DaysOfTheWeek, String> actualEnumMap = sut.of(DaysOfTheWeek.values(), activities);
        Assertions.assertEquals(5, actualEnumMap.size());
    }

}