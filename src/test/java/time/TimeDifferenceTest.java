package time;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeDifferenceTest {
    TimeDifference sut;
    private static final LocalDate startDate = LocalDate.of(1983, 9, 30);
    private static final LocalDate endDate = LocalDate.of(1984, 12, 2);
    private final LocalDateTime startDateTime = LocalDateTime.of(startDate, LocalTime.of(0, 0));
    private final LocalDateTime endDateTime = LocalDateTime.of(endDate, LocalTime.of(0, 0));

    @BeforeEach
    void setUp() {
        sut = new TimeDifference();
    }

    @Test
    void findTimeDifferenceUsingPeriod() {
        //when
        Period period = sut.between(startDate, endDate);
        //then
        assertEquals("P1Y2M3D", period.toString());
    }

    @Test
    void findTimeDifferenceUsingDuration() {
        //given
        LocalDateTime startDateTime = LocalDateTime.of(startDate, LocalTime.of(0, 0));
        LocalDateTime endDateTime = LocalDateTime.of(endDate, LocalTime.of(0, 0));
        //when
        Duration duration = sut.betweenUsingDuration(startDateTime, endDateTime);
        //then
        assertEquals("PT10320H", duration.toString());
    }

    @Test
    void findTimeDifferenceUsingChronoUnits() {
        //when
        var differenceInDAYS = sut.betweenUsingChrono(startDate, endDate, ChronoUnit.DAYS);
        var differenceInHOURS = sut.betweenUsingChrono(startDateTime, endDateTime, ChronoUnit.HOURS);
        //then
        assertEquals(430L, differenceInDAYS);
        assertEquals(10320L, differenceInHOURS);
    }
}