package time;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaInteroperationTest {
    private JavaInteroperation sut;

    @BeforeEach
    void setUp() {
        sut = new JavaInteroperation();
    }

    @Test
    void shouldGetInstantFromLegacyDate() throws ParseException {
        //Given
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        format.setTimeZone(TimeZone.getTimeZone("GMT"));
        var date = format.parse("1970-01-01T00:00:00Z");
        //When
        var expectedInstant = date.toInstant();
        //Then
        assertEquals(Instant.EPOCH, expectedInstant);
    }

    @Test
    void shouldGetLegacyDateFromInstant() throws ParseException {
        //Given
        Instant epochSeconds = Instant.ofEpochSecond(470811618);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        Date expectedDate = format.parse("1984-12-02T05:00:18Z");

        //When
        var actualDate = sut.dateFromInstant(epochSeconds);
        assertEquals(expectedDate, actualDate);
    }
}