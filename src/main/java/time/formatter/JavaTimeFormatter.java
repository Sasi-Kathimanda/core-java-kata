package time.formatter;


import java.time.Instant;
import java.time.LocalDate;

public class JavaTimeFormatter {
    protected LocalDate parseToLocalDate(String date) {
        return LocalDate.parse(date);
    }

    protected Instant parseStringToInstant(String date) {
        return Instant.parse(date);
    }

}
