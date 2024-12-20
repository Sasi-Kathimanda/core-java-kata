package time;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.Period;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
        assertEquals("P2D", period.toString());
    }

    @Test
    void between() {
        Period period = sut.between(LocalDate.of(1984, 12, 2), LocalDate.of(2022, 4, 19));
        assertEquals("P37Y4M17D", period.toString());
    }

    @Test
    void parse() {
        Period period = sut.parse("P5Y3M15D");
        assertEquals(5, period.getYears());
        assertEquals(3, period.getMonths());
        assertEquals(15, period.getDays());
    }
}