package time;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaDurationTest {
    JavaDuration sut;

    @BeforeEach
    void setUp() {
        sut = new JavaDuration();
    }

    @Test
    void durationOf() {
        Duration duration = sut.of(30, ChronoUnit.DAYS);
        assertEquals(30, duration.toDays());
    }

    @Test
    void durationOfDays() {
        Duration duration = sut.durationOfDays(7L);
        assertEquals("PT168H", duration.toString());
    }

    @Test
    void durationBetween() {
        Instant instant1 = Instant.parse("1984-12-02T10:15:30.345Z");
        Instant instant2 = Instant.parse("2022-04-04T21:18:20.1845Z");
        Duration duration = sut.between(instant1, instant2);
        assertEquals(37, duration.toDays() / 365);
    }

    @Test
    void durationParse() {
        Duration duration = sut.parse("p1DT2H1M10.5s"); //text has to be in the format PnDTnHnMn.nS
        assertEquals(1, duration.toDays());
        assertEquals(26, duration.toHours());
        assertEquals(2, duration.toHoursPart());
        assertEquals(1561, duration.toMinutes());
        assertEquals(93670, duration.toSeconds());
        assertEquals(10, duration.toSecondsPart());
        assertEquals(500000000, duration.toNanosPart());
    }

    @Test
    void durationOfDaysAddingDays() {
        Duration duration = sut.durationOfDays(1L);
        duration = duration.plusDays(4);
        assertEquals(5, duration.toDays());
    }
}