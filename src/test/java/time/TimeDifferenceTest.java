package time;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeDifferenceTest {
    TimeDifference sut;

    @BeforeEach
    void setUp() {
        sut = new TimeDifference();
    }

    @Test
    void differenceUsingPeriod() {
        //given
        LocalDate startDate = LocalDate.of(1983, 9, 30);
        LocalDate endDate = LocalDate.of(1984, 12, 2);

        //when
        Period period = sut.between(startDate, endDate);

        //then
        assertEquals("P1Y2M3D", period.toString());
    }

    @Test
    void differenceUsingDuration() {
        //given
        LocalDate startDate = LocalDate.of(1983, 9, 30);
        LocalDate endDate = LocalDate.of(1984, 12, 2);

        //when
        Duration duration = sut.betweenUsingDuration(startDate, endDate);

        //then
        assertEquals("PT10320H", duration.toString());
    }

}