package time;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Period;

class TimeDifferenceTest {
    TimeDifference sut;

    @BeforeEach
    void setUp() {
        sut = new TimeDifference();
    }

    @Test
    void differenceUsingPeriod() {
        //given
         LocalDate startDate = LocalDate.of(1983,9,30);
         LocalDate endDate = LocalDate.of(1984,12,2);

        //when
        Period period = sut.between(startDate,endDate);

        //then
        Assertions.assertEquals("P1Y3M2D",period.toString());
    }

}