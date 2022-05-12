package enums;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EnumMap;

class EnumMapsTest {
    EnumMaps sut;

    @BeforeEach
    void setUp() {
        sut = new EnumMaps();
    }

    @Test
    void GivenEnums_CreateEnumMap() {
        EnumMap<DaysOfTheWeek, String> actualEnumMap = sut.of(DaysOfTheWeek.MONDAY, "Yoga");
        Assertions.assertTrue(actualEnumMap.size() == 1);
    }

}