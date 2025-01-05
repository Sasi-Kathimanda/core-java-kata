package time;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaTimeParserTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void parseStringToLocalDate() {
        JavaTimeParser sut = new JavaTimeParser();
        LocalDate localDate = sut.parseToLocalDate("1984-12-02");
        assertEquals("1984-12-02", localDate.toString());
        assertEquals("December", localDate.getMonth().getDisplayName(TextStyle.FULL, Locale.UK));
        assertEquals("SUNDAY", localDate.getDayOfWeek().name());
        assertEquals(1984, localDate.getYear());
    }

    @Test
    void parseStringToLocalDateTime() {
        JavaTimeParser sut = new JavaTimeParser();
        LocalDateTime localDateTime = sut.parseToLocalDateTime("1984-12-02T00:00:00");
        assertEquals("1984-12-02T00:00", localDateTime.toString());
        assertEquals("December", localDateTime.getMonth().getDisplayName(TextStyle.FULL, Locale.UK));
        assertEquals("SUNDAY", localDateTime.getDayOfWeek().name());
        assertEquals(1984, localDateTime.getYear());
    }

    @Test
    void parseStringToLocalDateAlongWithDateTimeFormatter() {
        JavaTimeParser sut = new JavaTimeParser();
        LocalDate localDate = sut.parseToLocalDate("02-12-1984", DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        assertEquals("1984-12-02", localDate.toString());
        assertEquals("December", localDate.getMonth().getDisplayName(TextStyle.FULL, Locale.UK));
        assertEquals("SUNDAY", localDate.getDayOfWeek().name());
        assertEquals(1984, localDate.getYear());
    }

    @Test
    void parseStringToInstant() {
        JavaTimeParser sut = new JavaTimeParser();
        //date string valid UTC time with  DateTimeFormatter.ISO_INSTANT
        Instant actual = sut.parseStringToInstant("1984-12-02T10:15:30.345Z");
        assertEquals(470830530, actual.getEpochSecond());
        assertEquals(470830530345L, actual.toEpochMilli());
        assertEquals(345000000, actual.getNano());
    }
}