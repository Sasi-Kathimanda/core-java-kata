package time.formatter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.LocalDate;
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
    void parseStringToInstant() {
        JavaTimeParser sut = new JavaTimeParser();
        Instant actual = sut.parseStringToInstant("1984-12-02T10:15:30.345Z"); //date string valid UTC time with  DateTimeFormatter.ISO_INSTANT
        assertEquals(470830530, actual.getEpochSecond());
        assertEquals(470830530345L, actual.toEpochMilli());
        assertEquals(345000000, actual.getNano());
    }
}