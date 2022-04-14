package time;

import java.time.Period;

public class JavaPeriod {
    protected Period of(int years, int months , int days) {
        return Period.of(years, months, days);
    }

    protected Period ofDays(int days) {
        return Period.ofDays(days);
    }

    protected Period parse(String charSeqText) {
        return Period.parse(charSeqText);
    }
}
