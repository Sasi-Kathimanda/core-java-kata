package time;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.TemporalUnit;

public class JavaDuration {

    protected Duration of(long lon, TemporalUnit temporalUnit) {
        return Duration.of(lon, temporalUnit);
    }

    public Duration between(Instant instant1, Instant instant2) {
        return Duration.between(instant1, instant2);
    }
}
