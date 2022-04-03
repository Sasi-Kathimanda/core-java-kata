package time;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import time.JavaDateTimeFormatter;

import java.time.*;
import java.time.format.DateTimeFormatter;

import static java.time.format.DateTimeFormatter.ISO_OFFSET_DATE;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaDateTimeFormatterTest {
    private static final LocalDate LOCAL_DATE = LocalDate.of(1984, 12, 2);
    private static final LocalTime LOCAL_TIME = LocalTime.of(10, 15, 30);
    private static final LocalDateTime LOCAL_DATE_TIME = LocalDateTime.of(LOCAL_DATE, LOCAL_TIME);
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

        actual = sut.formatter(ISO_OFFSET_DATE, OffsetDateTime.of(LOCAL_DATE, LOCAL_TIME, ZoneOffset.ofHoursMinutes(4, 30)));
        assertEquals("1984-12-02+04:30", actual);
    }

    @Test
    void testInbuiltFormatterForTime() {
        var actual = sut.formatter(DateTimeFormatter.ISO_TIME, LocalDateTime.of(LOCAL_DATE, LOCAL_TIME));
        assertEquals("10:15:30", actual);

        actual = sut.formatter(DateTimeFormatter.ISO_TIME, OffsetTime.of(LOCAL_TIME, ZoneOffset.ofHoursMinutes(5, 30)));
        assertEquals("10:15:30+05:30", actual);

        actual = sut.formatter(DateTimeFormatter.ISO_OFFSET_TIME, OffsetTime.of(LOCAL_TIME, ZoneOffset.ofHoursMinutes(5, 30)));
        assertEquals("10:15:30+05:30", actual);

        actual = sut.formatter(DateTimeFormatter.ISO_LOCAL_TIME, LocalDateTime.of(LOCAL_DATE, LOCAL_TIME));
        assertEquals("10:15:30", actual);
    }

    @Test
    void testInbuiltFormatterForDateTime() {
        var actual = sut.formatter(DateTimeFormatter.ISO_OFFSET_DATE, OffsetDateTime.of(LOCAL_DATE_TIME, ZoneOffset.ofHoursMinutes(5, 30)));
        assertEquals("1984-12-02+05:30", actual);

        actual = sut.formatter(DateTimeFormatter.ISO_OFFSET_DATE_TIME, OffsetDateTime.of(LOCAL_DATE_TIME, ZoneOffset.ofHoursMinutes(5, 30)));
        assertEquals("1984-12-02T10:15:30+05:30", actual);

        actual = sut.formatter(DateTimeFormatter.ISO_ZONED_DATE_TIME, ZonedDateTime.of(LOCAL_DATE_TIME, ZoneId.of("Asia/Kolkata")));
        assertEquals("1984-12-02T10:15:30+05:30[Asia/Kolkata]", actual);

        actual = sut.formatter(DateTimeFormatter.ISO_DATE_TIME, ZonedDateTime.of(LOCAL_DATE_TIME, ZoneId.of("Asia/Kolkata")));
        assertEquals("1984-12-02T10:15:30+05:30[Asia/Kolkata]", actual);

        actual = sut.formatter(DateTimeFormatter.ISO_ORDINAL_DATE, ZonedDateTime.of(LOCAL_DATE_TIME, ZoneId.of("Asia/Kolkata")));
        assertEquals("1984-337+05:30", actual);

        actual = sut.formatter(DateTimeFormatter.ISO_WEEK_DATE, ZonedDateTime.of(LOCAL_DATE_TIME, ZoneId.of("Asia/Kolkata")));
        assertEquals("1984-W48-7+05:30", actual);

        actual = sut.formatter(DateTimeFormatter.ISO_INSTANT, ZonedDateTime.of(LOCAL_DATE_TIME, ZoneId.of("Asia/Kolkata")));
        assertEquals("1984-12-02T04:45:30Z", actual);
    }
}