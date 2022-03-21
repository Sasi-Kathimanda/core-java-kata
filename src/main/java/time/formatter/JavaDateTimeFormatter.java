package time.formatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class JavaDateTimeFormatter {

    protected String formatter(DateTimeFormatter dateTimeFormatter, LocalDate localDate) {
        return dateTimeFormatter.format(localDate);
    }
}
