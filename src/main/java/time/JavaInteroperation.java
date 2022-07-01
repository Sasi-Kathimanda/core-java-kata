package time;

import java.time.Instant;
import java.util.Date;

public class JavaInteroperation {

    protected Instant dateToInstant(Date date) {
        return date.toInstant();
    }
}
