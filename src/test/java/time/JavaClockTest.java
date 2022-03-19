package time;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Clock;

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
}