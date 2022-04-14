package time;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Period;

import static org.junit.jupiter.api.Assertions.*;

class JavaPeriodTest {
    JavaPeriod sut;

    @BeforeEach
    void setUp() {
        sut = new JavaPeriod();
    }

    @Test
    void of() {
        Period period = sut.of(1, 2, 3);
        assertEquals("P1Y2M3D", period.toString());
    }

    @Test
    void ofDays() {
        Period period = sut.ofDays(2);
        assertEquals("P2D",period.toString());
    }

    @Test
    void parse() {
        Period period = sut.parse("1984-12-02T10:15:30.345Z");
        assertEquals("",period.toString());
    }
}