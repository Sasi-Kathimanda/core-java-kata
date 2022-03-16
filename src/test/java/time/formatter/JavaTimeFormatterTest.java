package time.formatter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class JavaTimeFormatterTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void convertStringToDate() {
        JavaTimeFormatter sut = new JavaTimeFormatter();
        LocalDate localDate = sut.convertToDate("2022-03-17");
        assertEquals("2022-03-17",localDate.toString());
    }
}