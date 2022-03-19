package time;

import java.time.Clock;
import java.time.ZoneId;

public class JavaClock {
    protected Clock createSystemDefaultZone() {
        return Clock.systemDefaultZone();
    }

    protected Clock createSystemUTC() {
        return Clock.systemUTC();
    }

    protected Clock createSystem(String zoneId) {
        return Clock.system(ZoneId.of(zoneId));
    }
}
