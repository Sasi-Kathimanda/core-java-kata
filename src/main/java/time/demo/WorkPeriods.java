package time.demo;

import java.time.LocalDateTime;
import java.util.List;

public class WorkPeriods {

    private WorkPeriods() {
    }

    public static WorkPeriod createFullWorkPeriod(LocalDateTime start) {
        LocalDateTime end = LocalDateTime.from(start).plusHours(8).plusMinutes(0);
        return new WorkPeriod(start, end);
    }
    public static List<WorkPeriod> createWorkingPeriods(LocalDateTime start, int dayCount) {
        return List.of();
    }
}
