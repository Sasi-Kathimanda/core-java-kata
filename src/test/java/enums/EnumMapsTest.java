package enums;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EnumMapsTest {
    EnumMaps sut;

    @BeforeEach
    void setUp() {
        sut = new EnumMaps();
    }

    @Test
    void givenEnum_CreateEnumMap() {
        EnumMap<DaysOfTheWeek, String> actualEnumMap = sut.of(DaysOfTheWeek.MONDAY, "Yoga");
        assertEquals(1, actualEnumMap.size());
    }

    @Test
    void givenEnums_CreateEnumMap() {
        List<String> activities = List.of("Yoga", "Boxing", "Pilate", "Swimming", "Running");
        EnumMap<DaysOfTheWeek, String> actualEnumMap = sut.of(DaysOfTheWeek.values(), activities);
        assertEquals(5, actualEnumMap.size());
    }

    @Test
    void givenMap_CreateEnumMapFromCopyConstructor() {
        Map<DaysOfTheWeek, String> map = Map.of(DaysOfTheWeek.FRIDAY, "TGIF");
        EnumMap<DaysOfTheWeek, String> enumMap = sut.of(map);
        assertEquals(1, enumMap.size());
        assertEquals("{FRIDAY=TGIF}", enumMap.toString());
    }

    @Test
    void givenEnum_InvokeValues_ShouldGetAllValuesInEnumMap() {
        EnumMap<DaysOfTheWeek, String> actualEnumMap = sut.of(DaysOfTheWeek.MONDAY, "Yoga",
                DaysOfTheWeek.TUESDAY, "Boxing",
                DaysOfTheWeek.WEDNESDAY, "Pilates",
                DaysOfTheWeek.THURSDAY, "Swimming",
                DaysOfTheWeek.FRIDAY, "Running");

        assertEquals(5, actualEnumMap.size());
        assertEquals("[Yoga,Boxing,Pilates,Swimming,Running]", actualEnumMap.values());
    }

}