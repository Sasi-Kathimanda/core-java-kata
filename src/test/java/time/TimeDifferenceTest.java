package time;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeDifferenceTest {
    TimeDifference sut;

    @BeforeEach
    void setUp() {
        sut = new TimeDifference();
    }

    @Test
    void findTimeDifferenceUsingPeriod() {
        //given
        LocalDate startDate = LocalDate.of(1983, 9, 30);
        LocalDate endDate = LocalDate.of(1984, 12, 2);

        //when
        Period period = sut.between(startDate, endDate);

        //then
        assertEquals("P1Y2M3D", period.toString());
    }

    @Test
    void findTimeDifferenceUsingDuration() {
        //given
        LocalDate startDate = LocalDate.of(1983, 9, 30);
        LocalDate endDate = LocalDate.of(1984, 12, 2);
        LocalDateTime startDateTime =  LocalDateTime.of(startDate, LocalTime.of(0,0));
        LocalDateTime endDateTime =  LocalDateTime.of(endDate, LocalTime.of(0,0));

        //when
        Duration duration = sut.betweenUsingDuration(startDateTime, endDateTime);

        //then
        assertEquals("PT10320H", duration.toString());
    }

    @Test
    void  findTimeDifferenceUsingChronoUnits() {
        //given
        //when
        //then
    }
}