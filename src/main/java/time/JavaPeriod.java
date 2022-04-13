package time;

import java.time.Period;

public class JavaPeriod {
    protected Period of(int years, int months , int days) {
        return Period.of(years, months, days);
    }

    protected Period ofDays(long days) {
        return Period.ZERO;
    }
}
