package enums;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;

public class EnumMaps {

    protected EnumMap<DaysOfTheWeek, String> of(DaysOfTheWeek daysOfTheWeek, String activity) {
        EnumMap<DaysOfTheWeek, String> enumMap = new EnumMap<>(DaysOfTheWeek.class);
        enumMap.put(daysOfTheWeek, activity);
        return enumMap;
    }

    protected EnumMap<DaysOfTheWeek, String> of(DaysOfTheWeek[] daysOfTheWeeks, List<String> activities) {
        EnumMap<DaysOfTheWeek, String> eMap = new EnumMap<>(DaysOfTheWeek.class);
        int i = 0;
        if (daysOfTheWeeks.length != activities.size()) {
            throw new IllegalArgumentException("days of the week doesn't have enough activities");
        }
        for (DaysOfTheWeek day : daysOfTheWeeks) {
            eMap.put(day, activities.get(i));
            i++;
        }
        return eMap;
    }
}
