package enums;

import java.util.EnumMap;
import java.util.Map;

public class EnumMaps {

    public EnumMap<DaysOfTheWeek, String> of(DaysOfTheWeek daysOfTheWeek, String activity) {
        return new EnumMap<>(DaysOfTheWeek.class);
    }
}
