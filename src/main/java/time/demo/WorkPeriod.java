package time.demo;

import java.time.LocalDateTime;

public class WorkPeriod {
    private final LocalDateTime startTime;
    private final LocalDateTime endTime;

    public WorkPeriod(LocalDateTime startTime, LocalDateTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }
}
