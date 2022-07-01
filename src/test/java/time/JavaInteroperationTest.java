package time;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

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
}