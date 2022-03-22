package time.formatter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaDateTimeFormatterTest {
    JavaDateTimeFormatter dateTimeFormatter;

    @BeforeEach
    void setUp() {
        dateTimeFormatter = new JavaDateTimeFormatter();
    }

    @Test
    void testInbuiltFormatterForDates() {
        var actual = dateTimeFormatter.formatter(DateTimeFormatter.BASIC_ISO_DATE, LocalDate.of(1984, 12, 2));
        assertEquals("19841202", actual);

        actual = dateTimeFormatter.formatter(DateTimeFormatter.ISO_DATE, LocalDate.of(1984, 12, 2));
        assertEquals("1984-12-02", actual);

        actual = dateTimeFormatter.formatter(DateTimeFormatter.ISO_LOCAL_DATE, LocalDate.of(1984, 12, 2));
        assertEquals("1984-12-02", actual);

    }
}