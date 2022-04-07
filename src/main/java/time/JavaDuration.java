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

    // textSequence have to be ISO-8601 duration format PnDTnHnMn.nS
    public Duration parse(String textSequence) {
        return Duration.parse(textSequence);
    }

    public Duration durationOfDays(long days) {
        return Duration.ofDays(days);
    }
}
