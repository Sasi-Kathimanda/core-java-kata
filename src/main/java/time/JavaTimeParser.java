package time;


import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class JavaTimeParser {
    protected LocalDate parseToLocalDate(String date) {
        return LocalDate.parse(date);
    }

    protected LocalDate parseToLocalDate(String date, DateTimeFormatter ofPattern) {
        return LocalDate.parse(date, ofPattern);
    }

    protected Instant parseStringToInstant(String date) {
        return Instant.parse(date);
    }
}
