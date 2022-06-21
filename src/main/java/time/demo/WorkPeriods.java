package time.demo;

import java.time.LocalDateTime;

public class WorkPeriods {

    private WorkPeriods() {
    }

    public static WorkPeriod createWorkPeriod(LocalDateTime start) {
        LocalDateTime end = LocalDateTime.from(start).plusHours(8).plusMinutes(0);
        return new WorkPeriod(start, end);
    }
}
