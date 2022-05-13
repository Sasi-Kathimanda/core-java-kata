package enums;

import java.util.EnumMap;
import java.util.List;

public class EnumMaps {

    protected EnumMap<DaysOfTheWeek, String> of(DaysOfTheWeek daysOfTheWeek, String activity) {
        EnumMap<DaysOfTheWeek, String> enumMap = new EnumMap<>(DaysOfTheWeek.class);
        enumMap.put(daysOfTheWeek, activity);
        return enumMap;
    }

    protected EnumMap<DaysOfTheWeek, String> of(DaysOfTheWeek[] daysOfTheWeeks, List<String> activities) {
        return new EnumMap<>(DaysOfTheWeek.class);
    }
}
