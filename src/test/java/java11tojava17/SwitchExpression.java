package java11tojava17;

public class SwitchExpression {

    public String convertEnumToString(Months months) {
        return switch (months) {
            case JAN, FEB, MAR -> "quarter 1";
            case APR, MAY, JUN -> "quarter 2";
        };
    }

    public enum Months {
        JAN, FEB, MAR, APR, MAY, JUN;
    }
}
