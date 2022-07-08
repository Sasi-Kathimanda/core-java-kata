package time;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaClockTest {
    JavaClock sut;

    @BeforeEach
    void setUp() {
        sut = new JavaClock();
    }

    @Test
    void shouldGetSystemDefaultZone() {
        Clock clock = sut.createSystemDefaultZone();
        assertEquals("Europe/London", clock.getZone().toString());
    }

    @Test
    void shouldGetSystemUTC() {
        Clock clock = sut.createSystemUTC();
        assertEquals("SystemClock[Z]", clock.toString());
        assertEquals("Z", clock.getZone().toString()); //UTC is standard and not have a timezone
    }

    @Test
    void shouldGetFromGivenZoneId() {
        Clock clock = sut.createSystem("Asia/Kolkata");
        assertEquals("SystemClock[Asia/Kolkata]", clock.toString());
        assertEquals("Asia/Kolkata", clock.getZone().toString());
    }

    @Test
    void shouldGetFixedClockWithAGivenInstant() {
        Clock clock = sut.createFixedClock(Instant.parse("1984-12-02T10:15:30.345Z"), ZoneId.of("Asia/Kolkata"));
        assertEquals("FixedClock[1984-12-02T10:15:30.345Z,Asia/Kolkata]", clock.toString());
        assertEquals("1984-12-02T10:15:30.345Z", clock.instant().toString());
        assertEquals("Asia/Kolkata", clock.getZone().getId());
    }
}