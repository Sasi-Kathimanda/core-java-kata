package time.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

class WorkPeriodsTest {
    public static final LocalDateTime LOCAL_DATE_TIME = LocalDateTime.of(2022, 6, 21, 9, 5);
    private WorkPeriods sut;

    @BeforeEach
    void setUp() {
    }

    @Test
    void createFullWorkPeriod() {
        WorkPeriod actual = WorkPeriods.createFullWorkPeriod(LOCAL_DATE_TIME);
        Assertions.assertEquals("2022-06-21T09:05", actual.getStartTime().toString());
        Assertions.assertEquals("2022-06-21T17:05", actual.getEndTime().toString());
    }

    @Test
    void createWorkingPeriods() {
        List<WorkPeriod> workPeriods = WorkPeriods.createWorkingPeriods(LOCAL_DATE_TIME, 2);
        Assertions.assertEquals(2, workPeriods.size());
    }
}