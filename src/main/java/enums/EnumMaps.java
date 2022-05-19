package enums;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

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

    public EnumMap<DaysOfTheWeek, String> of(Map<DaysOfTheWeek, String> map) {
        return new EnumMap<>(map);
    }

    public <T extends Enum<T>> EnumMap<T, String> of(T k1, String v1, T k2, String v2, T k3, String v3, T k4, String v4, DaysOfTheWeek k5, String v5) {
        return new EnumMap<>(Map.of(k1, v1));
    }
}
