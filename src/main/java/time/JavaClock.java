package time;

import java.time.Clock;

public class JavaClock {
    protected Clock createSystemDefaultZone() {
        return Clock.systemDefaultZone();
    }
}
