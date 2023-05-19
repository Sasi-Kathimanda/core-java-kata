package time;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class JavaInstant {
    protected Instant of() {
        return Instant.EPOCH;
    }

    public LocalDateTime instantToLocalDateTime(Instant instant, ZoneId zoneId) {
        return LocalDateTime.ofInstant(instant, zoneId);
    }
}
