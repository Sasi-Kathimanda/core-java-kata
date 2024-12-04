package enums;

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
        assertEquals("Yoga", actualEnumMap.get(DaysOfTheWeek.MONDAY));
    }

    @Test
    void givenEnums_CreateEnumMap() {
        List<String> activities = List.of("Yoga", "Boxing", "Pilate", "Swimming", "Running");
        EnumMap<DaysOfTheWeek, String> actualEnumMap = sut.of(DaysOfTheWeek.values(), activities);
        assertEquals(5, actualEnumMap.size());
        assertEquals("Yoga", actualEnumMap.get(DaysOfTheWeek.MONDAY));
        assertEquals("Boxing", actualEnumMap.get(DaysOfTheWeek.TUESDAY));
        assertEquals("Pilate", actualEnumMap.get(DaysOfTheWeek.WEDNESDAY));
        assertEquals("Swimming", actualEnumMap.get(DaysOfTheWeek.THURSDAY));
        assertEquals("Running", actualEnumMap.get(DaysOfTheWeek.FRIDAY));

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
        assertEquals("[Yoga, Boxing, Pilates, Swimming, Running]", actualEnumMap.values().toString());
    }

    @Test
    void givenEnum_InvokeKeySet_ShouldGetAllKeysInEnumMap() {
        EnumMap<DaysOfTheWeek, String> actualEnumMap = sut.of(DaysOfTheWeek.MONDAY, "Yoga",
                DaysOfTheWeek.TUESDAY, "Boxing",
                DaysOfTheWeek.WEDNESDAY, "Pilates",
                DaysOfTheWeek.THURSDAY, "Swimming",
                DaysOfTheWeek.FRIDAY, "Running");
        assertEquals("[MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY]", actualEnumMap.keySet().toString());
    }

    @Test
    void givenEnum_InvokeEntrySet_ShouldGetAllEntriesInEnumMap() {
        EnumMap<DaysOfTheWeek, String> actualEnumMap = sut.of(DaysOfTheWeek.MONDAY, "Yoga",
                DaysOfTheWeek.TUESDAY, "Boxing",
                DaysOfTheWeek.WEDNESDAY, "Pilates",
                DaysOfTheWeek.THURSDAY, "Swimming",
                DaysOfTheWeek.FRIDAY, "Running");
        assertEquals("[MONDAY=Yoga, TUESDAY=Boxing, WEDNESDAY=Pilates, THURSDAY=Swimming, FRIDAY=Running]", actualEnumMap.entrySet().toString());
    }

}