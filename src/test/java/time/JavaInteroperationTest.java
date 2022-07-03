package time;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaInteroperationTest {
    private JavaInteroperation sut;

    @BeforeEach
    void setUp() {
        sut = new JavaInteroperation();
    }

    @Test
    void convertLegacyDateToInstant() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        Date date = format.parse("1970-01-01T00:00:00Z");
        //FIXME: understand why its clocking back when convert to Instant
        assertEquals("1969-12-31T23:00:00Z", sut.dateToInstant(date).toString());
    }

    @Test
    void convertDateFromInstant() throws ParseException {
        Instant epochSeconds = Instant.ofEpochSecond(470811618);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        Date date = format.parse("1970-01-01T00:00:00Z");

        assertEquals(date, sut.dateFromInstant(epochSeconds));
    }
}