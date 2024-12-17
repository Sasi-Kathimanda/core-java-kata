package javaeleven.to.javaseventeen;

public class SwitchExpression {

    public String getQuarter(Months month) {
        return switch (month) {
            case JAN, FEB, MAR -> "Q1";
            case APR, MAY, JUN -> "Q2";
        };
    }

    public enum Months {
        JAN, FEB, MAR, APR, MAY, JUN
    }
}
