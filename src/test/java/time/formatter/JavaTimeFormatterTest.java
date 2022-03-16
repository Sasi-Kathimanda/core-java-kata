package time.formatter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaTimeFormatterTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void convertStringToDate() {
        JavaTimeFormatter sut = new JavaTimeFormatter();
        LocalDate localDate = sut.convertToDate("1984-12-02");
        assertEquals("1984-12-02", localDate.toString());
        assertEquals("December", localDate.getMonth().getDisplayName(TextStyle.FULL, Locale.UK));
        assertEquals("SUNDAY", localDate.getDayOfWeek().name());
        assertEquals(1984, localDate.getYear());
    }

    @Test
    void convertStringToInstant() {
        JavaTimeFormatter sut = new JavaTimeFormatter();
        Instant actual = sut.convertToInstant("1984-08-13T10:15:30.345Z");
        assertEquals(461240130, actual.getEpochSecond());
    }
}