package time.formatter;


import java.time.Instant;
import java.time.LocalDate;

public class JavaTimeFormatter {
    protected LocalDate convertToDate(String date) {
        return LocalDate.parse(date);
    }

    public Instant convertToInstant(String date) {
        return Instant.parse(date);
    }
}
