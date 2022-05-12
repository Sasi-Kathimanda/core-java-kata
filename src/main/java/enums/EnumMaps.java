package enums;

import java.util.EnumMap;

public class EnumMaps {

    protected EnumMap<DaysOfTheWeek, String> of(DaysOfTheWeek daysOfTheWeek, String activity) {
        EnumMap<DaysOfTheWeek, String> enumMap = new EnumMap<>(DaysOfTheWeek.class);
        enumMap.put(daysOfTheWeek, activity);
        return enumMap;
    }
}
