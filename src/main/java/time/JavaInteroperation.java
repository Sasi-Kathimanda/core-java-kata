package time;

import java.time.Instant;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

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

    protected ZoneId timeZoneToZoneId(TimeZone timeZone) {
        return timeZone.toZoneId();
    }

    protected TimeZone zoneIdToTimeZone(ZoneId zoneId) {
        return TimeZone.getTimeZone(zoneId);
    }
}
