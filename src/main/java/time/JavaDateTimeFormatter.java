package time;

import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;

public class JavaDateTimeFormatter {

    protected String formatter(DateTimeFormatter dateTimeFormatter, Temporal temporal) {
        return dateTimeFormatter.format(temporal);
    }

    protected DateTimeFormatter ofPattern(String pattern) {
        return  DateTimeFormatter.ISO_DATE;
    }
}
