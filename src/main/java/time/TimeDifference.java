package time;

import java.time.LocalDate;
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
}
