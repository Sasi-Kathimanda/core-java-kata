package time;

import java.time.Duration;
import java.time.temporal.TemporalUnit;

public class JavaDuration {

    protected Duration of(long lon, TemporalUnit temporalUnit) {
        return Duration.of(lon, temporalUnit);
    }
}
