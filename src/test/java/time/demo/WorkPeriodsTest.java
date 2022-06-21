package time.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

class WorkPeriodsTest {
    private WorkPeriods sut;

    @BeforeEach
    void setUp() {
    }


    @Test
    void createWorkPeriod() {
        WorkPeriod actual = WorkPeriods.createWorkPeriod(LocalDateTime.of(2022, 6, 21, 9, 5));
        Assertions.assertEquals("2022-06-21T09:05", actual.getStartTime().toString());
        Assertions.assertEquals("2022-06-21T17:05", actual.getEndTime().toString());
    }
}