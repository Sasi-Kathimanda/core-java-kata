package auto.ai;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.add(-2, 2));
        assertEquals(-5, calculator.add(-2, -3));
    }

    @Test
    void testSubtraction() {
        assertEquals(1, calculator.subtract(3, 2));
        assertEquals(-4, calculator.subtract(-2, 2));
        assertEquals(1, calculator.subtract(-2, -3));
    }

    @Test
    void testMultiplication() {
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(-4, calculator.multiply(-2, 2));
        assertEquals(6, calculator.multiply(-2, -3));
        assertEquals(0, calculator.multiply(0, 3));
    }

    @Test
    void testDivision() {
        assertEquals(2, calculator.divide(6, 3));
        assertEquals(-2, calculator.divide(-6, 3));
        assertEquals(2, calculator.divide(-6, -3));
    }

    @Test
    void testDivisionByZero() {
        assertEquals(Double.NaN, calculator.divide(6, 0));
        assertEquals(Double.NaN, calculator.divide(0, 0));
    }

    @Test
    void testSquareRoot() {
        assertEquals(3, calculator.sqrt(9));
        assertEquals(0, calculator.sqrt(0));
    }

    @Test
    void testSquareRootOfNegative() {
        assertEquals(Double.NaN, calculator.sqrt(-9));
    }

    @Test
    void testExponent() {
        assertEquals(8, calculator.exponent(2, 3));
        assertEquals(1, calculator.exponent(2, 0));
        assertEquals(0.5, calculator.exponent(2, -1));
    }
}