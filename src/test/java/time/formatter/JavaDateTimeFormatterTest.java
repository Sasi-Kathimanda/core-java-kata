package time.formatter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaDateTimeFormatterTest {
    private static final LocalDate LOCAL_DATE = LocalDate.of(1984, 12, 2);
    JavaDateTimeFormatter sut;

    @BeforeEach
    void setUp() {
        sut = new JavaDateTimeFormatter();
    }

    @Test
    void testInbuiltFormatterForDates() {
        var actual = sut.formatter(DateTimeFormatter.BASIC_ISO_DATE, LOCAL_DATE);
        assertEquals("19841202", actual);

        actual = sut.formatter(DateTimeFormatter.ISO_DATE, LOCAL_DATE);
        assertEquals("1984-12-02", actual);

        actual = sut.formatter(DateTimeFormatter.ISO_LOCAL_DATE, LOCAL_DATE);
        assertEquals("1984-12-02", actual);

    }

    @Test
    void testInbuiltFormatterForTime() {
        var actual = sut.formatter(DateTimeFormatter.ISO_TIME, LocalDateTime.of(LOCAL_DATE, LocalTime.of(10,15,30)));
        assertEquals("10:15:30", actual);
    }
}