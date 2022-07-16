package time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

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

    protected long betweenUsingChrono(LocalDate startDate, LocalDate endDate, ChronoUnit chronUnit) {
        return chronUnit.between(startDate, endDate.plusDays(1));
    }

    protected long betweenUsingChrono(LocalDateTime startDateTime, LocalDateTime endDateTime, ChronoUnit chronUnit) {
        return chronUnit.between(startDateTime, endDateTime.plusDays(1));
    }
}
