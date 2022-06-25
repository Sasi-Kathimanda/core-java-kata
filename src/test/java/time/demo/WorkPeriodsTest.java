package time.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class WorkPeriodsTest {
    public static final LocalDateTime LOCAL_DATE_TIME = LocalDateTime.of(2022, 6, 21, 9, 5);
    public static final LocalDate LOCAL_DATE = LocalDate.of(2022, 6, 21);
    private WorkPeriods sut;

    @Test
    void createFullWorkPeriod() {
        WorkPeriod actual = WorkPeriods.createFullWorkPeriod(LOCAL_DATE_TIME);
        assertEquals("2022-06-21T09:05", actual.getStartTime().toString());
        assertEquals("2022-06-21T17:05", actual.getEndTime().toString());
    }

    @Test
    void createWorkingPeriods() {
        List<WorkPeriod> workPeriods = WorkPeriods.createWorkingPeriods(LOCAL_DATE, 2);
        assertEquals(2, workPeriods.size());
        assertEquals(21, workPeriods.get(0).getStartTime().getDayOfMonth());
        assertEquals(22, workPeriods.get(1).getStartTime().getDayOfMonth());
    }

    @Test
    void createWorkingPeriodsForAM_PM() {
        List<WorkPeriod> workPeriods = WorkPeriods.createWorkingPeriodsForAM_AND_PM(LOCAL_DATE, 2);
        assertEquals(4, workPeriods.size());
        //AM
        assertEquals(21, workPeriods.get(0).getStartTime().getDayOfMonth());
        assertEquals(21, workPeriods.get(1).getStartTime().getDayOfMonth());
        //PM
        assertEquals(22, workPeriods.get(2).getStartTime().getDayOfMonth());
        assertEquals(22, workPeriods.get(3).getStartTime().getDayOfMonth());
    }
}