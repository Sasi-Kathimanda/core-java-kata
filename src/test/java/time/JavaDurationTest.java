package time;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

class JavaDurationTest {
    JavaDuration sut;

    @BeforeEach
    void setUp() {
        sut =  new JavaDuration();
    }

    @Test
    void durationOf() {
        Duration duration = sut.of(30, ChronoUnit.DAYS);
        Assertions.assertEquals(30, duration.toDays());
    }
}