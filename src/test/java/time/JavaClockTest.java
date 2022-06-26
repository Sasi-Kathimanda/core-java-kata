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
    void testClockIsCreatedFromClockSystemDefaultZone() {
        Clock clock = sut.createSystemDefaultZone();
        assertEquals("Europe/London", clock.getZone().toString());
    }

    @Test
    void testClockIsCreatedFromSystemUTC() {
        Clock clock = sut.createSystemUTC();
        assertEquals("Z", clock.getZone().toString());
    }

    @Test
    void testClockIsCreatedFromGivenSystem() {
        Clock clock = sut.createSystem("Asia/Kolkata");
        assertEquals("Asia/Kolkata", clock.getZone().toString());
    }

    @Test
    void testFixedClockWithAGivenInstant() {
        Clock clock = sut.createFixedClock(Instant.parse("1984-12-02T10:15:30.345Z"), ZoneId.of("Asia/Kolkata"));
        assertEquals("1984-12-02T10:15:30.345Z", clock.instant().toString());
    }
}