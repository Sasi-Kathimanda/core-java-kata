package java11tojava17;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwitchExpressionTest {

    @Test
    void convertMonthToQuarter() {
        SwitchExpression expression = new SwitchExpression();
        assertEquals("Q1", expression.convertEnumToString(SwitchExpression.Months.JAN));
    }

}