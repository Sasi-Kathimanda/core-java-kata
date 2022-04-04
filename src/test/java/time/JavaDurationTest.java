package time;


import org.junit.jupiter.api.Assertions;
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
        sut =  new JavaDuration();
    }

    @Test
    void durationOf() {
        Duration duration = sut.of(30, ChronoUnit.DAYS);
        assertEquals(30, duration.toDays());
    }

    @Test
    void durationBetween() {
        Instant instant1 = Instant.parse("1984-12-02T10:15:30.345Z");
        Instant instant2 = Instant.parse("2022-04-04T21:18:20.1845Z");
        Duration duration = sut.between(instant1,instant2);
        assertEquals(36,duration.toDays()/12);
    }
}