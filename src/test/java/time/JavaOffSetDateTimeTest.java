package time;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;

class JavaOffSetDateTimeTest {

    @Test
    void givenDateTimeGetOffsetDateTime() {
        var dateTime = LocalDateTime.of(
                LocalDate.of(1984, 12, 2),
                LocalTime.of(5, 15));

        var offSetTime = JavaOffSetDateTime.of(dateTime, ZoneOffset.of("+05:30"));
        Assertions.assertEquals("1984-12-02T05:15+05:30", offSetTime.toString());
    }
}