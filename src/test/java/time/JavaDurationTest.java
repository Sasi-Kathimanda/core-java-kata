package time;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.temporal.UnsupportedTemporalTypeException;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
        assertEquals("PT720H", duration.toString());

        duration = sut.of(30, ChronoUnit.HALF_DAYS);
        assertEquals(15, duration.toDays());
        assertEquals("PT360H", duration.toString());

        duration = sut.of(1, ChronoUnit.HOURS);
        assertEquals(60, duration.toMinutes());
        assertEquals(3600, duration.toSeconds());
        assertEquals(3600000000000L, duration.toNanos());
        assertEquals("PT1H", duration.toString());

        duration = sut.of(1, ChronoUnit.MINUTES);
        assertEquals(1, duration.toMinutes());
        assertEquals(60, duration.toSeconds());
        assertEquals(600_000_000_00L, duration.toNanos());
        assertEquals("PT1M", duration.toString());

        duration = sut.of(1, ChronoUnit.SECONDS);
        assertEquals(0, duration.toMinutes());
        assertEquals(1, duration.toSeconds());
        assertEquals(100_000_000_0L, duration.toNanos());
        assertEquals("PT1S", duration.toString());

        duration = sut.of(1, ChronoUnit.NANOS);
        assertEquals(0, duration.toMinutes());
        assertEquals(0, duration.toSeconds());
        assertEquals(1L, duration.toNanos());
        assertEquals("PT0.000000001S", duration.toString());
    }

    @Test
    void durationOfShouldThrowException_WhenWePassMoreThanADay() {
        assertThrows(UnsupportedTemporalTypeException.class, () -> sut.of(12, ChronoUnit.MONTHS));
        assertThrows(UnsupportedTemporalTypeException.class, () -> sut.of(1, ChronoUnit.DECADES));
        assertThrows(UnsupportedTemporalTypeException.class, () -> sut.of(1, ChronoUnit.ERAS));
        assertThrows(UnsupportedTemporalTypeException.class, () -> sut.of(1, ChronoUnit.CENTURIES));
        assertThrows(UnsupportedTemporalTypeException.class, () -> sut.of(1, ChronoUnit.MILLENNIA));
        assertThrows(UnsupportedTemporalTypeException.class, () -> sut.of(1, ChronoUnit.FOREVER));
    }

    @Test
    void durationOfNanos() {
        Duration duration = sut.ofNanos(1_000_000_000);
        assertEquals("PT1S", duration.toString());
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

    @Test
    void durationOfSeconds() {
        Duration duration = sut.durationOfSeconds(90);
        assertEquals("PT1M30S", duration.toString());
    }

    @Test
    void durationOfSecondsWithNanosAdjustment() {
        Duration duration = sut.durationOfSeconds(90, 30);
        duration = duration.withNanos(1).withSeconds(60);
        assertEquals("PT1M0.000000001S", duration.toString());
    }

    @Test
    void durationMinus() {
        Duration duration = sut.durationMinus(Duration.ofDays(2), 1);
        assertEquals("PT24H", duration.toString());
    }

    @Test
    void durationMinusDays() {
        Duration duration = sut.durationMinusDays(Duration.ofDays(3), 2);
        assertEquals("PT24H", duration.toString());
    }

    @Test
    void durationPlusDays() {
        Duration duration = sut.durationPlusDays(Duration.ofDays(3), 2);
        assertEquals(5, duration.toDays());
        assertEquals(120, duration.toHours());
        assertEquals(0, duration.toHoursPart());
        assertEquals("PT120H", duration.toString());
    }

    @Test
    void durationPlus() {
        Duration duration = sut.plusDuration(Duration.ofDays(1), 1);
        assertEquals("PT48H", duration.toString());
    }

    @Test
    void givenDurationsWhenFindLongestDurationInvokedThenGivesLongestDuration() {
        var durations = List.of(Duration.ofSeconds(100), Duration.ofSeconds(200), Duration.ofSeconds(300));
        assertEquals(Duration.ofSeconds(300), sut.findLongestDuration(durations));
    }

    @Test
    void givenDurationWhenTotalDurationInvokedThenGivesTotalDuration() {
        var durations = List.of(Duration.ofSeconds(100), Duration.ofSeconds(200), Duration.ofSeconds(300));
        assertEquals(Duration.ofSeconds(600), sut.totalDuration(durations));
    }
}