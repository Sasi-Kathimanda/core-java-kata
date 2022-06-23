package time.demo;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WorkPeriods {

    public static final LocalTime MORNING_AM_START = LocalTime.of(8, 5);
    public static final LocalTime EVENING_PM_START = LocalTime.of(12, 5);
    public static final Duration AM_DURATION_HOURS = Duration.ofHours(3).plusMinutes(30);
    public static final Duration PM_DURATION_HOURS = Duration.ofHours(4).plusMinutes(30);

    private WorkPeriods() {
    }

    public static WorkPeriod createFullWorkPeriod(LocalDateTime start) {
        LocalDateTime end = LocalDateTime.from(start).plusHours(8).plusMinutes(0);
        return new WorkPeriod(start, end);
    }

    public static WorkPeriod createMorningWorkPeriod(LocalDate start) {
        LocalDateTime startTime = LocalDateTime.of(start, MORNING_AM_START);
        LocalDateTime endTime = startTime.plus(AM_DURATION_HOURS);
        return new WorkPeriod(startTime, endTime);
    }

    public static WorkPeriod createEveningWorkPeriod(LocalDate start) {
        LocalDateTime startTime = LocalDateTime.of(start, EVENING_PM_START);
        LocalDateTime endTime = startTime.plus(PM_DURATION_HOURS);
        return new WorkPeriod(startTime, endTime);
    }

    public static List<WorkPeriod> createWorkingPeriods(LocalDate start, int dayCount) {
        List<LocalDate> workingDays = generateWorkingDays(start, dayCount);
        return workingDays.stream()
                .map(d -> createFullWorkPeriod(d.atTime(8, 0)))
                .collect(Collectors.toList());
    }

    public static List<WorkPeriod> createWorkingPeriodsForAM_AND_PM(LocalDate start, int dayCount) {
        List<LocalDate> workingDays = generateWorkingDays(start, dayCount);
        return workingDays.stream()
                .flatMap(d -> Stream.of(createMorningWorkPeriod(d), createMorningWorkPeriod(d)))
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
