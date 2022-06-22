package time.demo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WorkPeriods {

    private WorkPeriods() {
    }

    public static WorkPeriod createFullWorkPeriod(LocalDateTime start) {
        LocalDateTime end = LocalDateTime.from(start).plusHours(8).plusMinutes(0);
        return new WorkPeriod(start, end);
    }

    public static List<WorkPeriod> createWorkingPeriods(LocalDate start, int dayCount) {
        List<LocalDate> workingDays = generateWorkingDays(start, dayCount);
        return workingDays.stream()
                .map(d -> createFullWorkPeriod(d.atTime(8,0)))
                .collect(Collectors.toList());
    }

    private static List<LocalDate> generateWorkingDays(LocalDate start, int dayCount) {
        return Stream.iterate(start, d -> d.plusDays(1))
                .filter(WorkPeriods::isWorkingDay)
                .limit(dayCount)
                .collect(Collectors.toList());
    }

    private static boolean isWorkingDay(LocalDate localDate) {
        return !List.of(DayOfWeek.SATURDAY, DayOfWeek.SUNDAY).contains(localDate.getDayOfWeek());
    }
}
