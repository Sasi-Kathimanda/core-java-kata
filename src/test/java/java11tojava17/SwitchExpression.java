package java11tojava17;

public class SwitchExpression {

    public String convertEnumToString(Months months) {
        return switch (months) {
            case JAN, FEB, MAR -> "Q1";
            case APR, MAY, JUN -> "Q2";
        };
    }

    public enum Months {
        JAN, FEB, MAR, APR, MAY, JUN;
    }
}
