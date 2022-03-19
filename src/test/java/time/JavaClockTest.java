package time;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Clock;

import static org.junit.jupiter.api.Assertions.*;

class JavaClockTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testInstantIsCreatedFromClockSystemDefaultZone() {
        JavaClock sut = new JavaClock();
        Clock clock = sut.createSystemDefaultZone();
        assertEquals("Europe/London", clock.getZone().toString());
    }
}