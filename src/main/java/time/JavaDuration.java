package time;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.TemporalUnit;
import java.util.List;

public class JavaDuration {

    protected Duration of(long lon, TemporalUnit temporalUnit) {
        return Duration.of(lon, temporalUnit);
    }

    protected Duration between(Instant instant1, Instant instant2) {
        return Duration.between(instant1, instant2);
    }

    // textSequence have to be ISO-8601 duration format PnDTnHnMn.nS
    protected Duration parse(String textSequence) {
        return Duration.parse(textSequence);
    }

    protected Duration durationOfDays(long days) {
        return Duration.ofDays(days);
    }

    protected Duration durationOfSeconds(long seconds) {
        return Duration.ofSeconds(seconds);
    }

    protected Duration durationOfSeconds(long seconds, long nanos) {
        return Duration.ofSeconds(seconds, nanos);
    }

    protected Duration durationMinus(Duration duration, long days) {
        return duration.minus(Duration.ofDays(days));
    }

    protected Duration durationMinusDays(Duration duration, long daysToSubtract) {
        return duration.minusDays(daysToSubtract);
    }

    protected Duration durationPlusDays(Duration ofDays, long daysToAdd) {
        return ofDays.plusDays(daysToAdd);
    }

    protected Duration plusDuration(Duration duration, long daysToDuration) {
        return duration.plus(Duration.ofDays(daysToDuration));
    }

    protected Duration ofNanos(long nanos) {
        return Duration.ofNanos(nanos);
    }

    protected Duration findLongestDuration(List<Duration> durations) {
        Duration longest = Duration.ZERO;
        for (Duration duration : durations) {
            longest = duration.compareTo(longest) > 0 ? duration : longest;
        }
        return longest;
    }

    protected Duration totalDuration(List<Duration> durations) {
        var result = durations.stream().mapToLong(Duration::getSeconds).sum();
        return Duration.ofSeconds(result);
    }
}
