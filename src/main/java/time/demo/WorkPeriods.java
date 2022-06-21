package time.demo;

import java.time.LocalDateTime;

public class WorkPeriods {

    public static WorkPeriod createWorkPeriod(LocalDateTime start) {

        return new WorkPeriod(start, LocalDateTime.MIN);
    }
}
