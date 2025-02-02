package javaeleven.to.javaseventeen;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SwitchExpressionTest {

    @Test
    void convertMonthToQuarter() {
        SwitchExpression expression = new SwitchExpression();
        assertEquals("Q1", expression.getQuarter(SwitchExpression.Months.JAN));
        assertEquals("Q2", expression.getQuarter(SwitchExpression.Months.APR));
    }

}