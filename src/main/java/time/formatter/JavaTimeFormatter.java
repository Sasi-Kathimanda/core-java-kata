package time.formatter;


import java.time.LocalDate;

public class JavaTimeFormatter {
    protected LocalDate convertToDate(String date) {
        return LocalDate.parse(date);
    }
}
