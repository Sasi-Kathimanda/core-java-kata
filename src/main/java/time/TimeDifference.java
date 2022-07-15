package time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

/**
 * have two versions to find time difference :
 * 1) @TemporalAmount.between()
 * 2) @ChronoUnit.UNIT.between()
 */
public class TimeDifference {

    protected Period between(LocalDate startDate, LocalDate endDate) {
        return Period.between(startDate, endDate.plusDays(1));
    }

    protected Duration betweenUsingDuration(LocalDateTime startDate, LocalDateTime endDate) {
        return Duration.between(startDate, endDate.plusDays(1));
    }

    public long betweenUsingChronoDays(LocalDate startDate, LocalDate endDate) {
        return 0L;
    }
}
