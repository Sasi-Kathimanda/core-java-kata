package time;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class JavaInteroperation {

    protected Instant dateToInstant(Date date) {
        return date.toInstant();
    }

    protected Date dateFromInstant(Instant epochSeconds) {
        return Date.from(epochSeconds);
    }

    protected Instant calendarToInstant(Calendar calendar) {
        return calendar.toInstant();
    }
}
