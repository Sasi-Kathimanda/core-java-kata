package java11tojava17.sealed.interfaces;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CircleTest {
    private Circle circle;

    @BeforeEach
    void setUp() {
        circle = new Circle();
    }

    @Test
    void drawMethodShouldDrawCircle() {
        //When
        circle.draw();
        //Then
        assertEquals("circle drawn", circle.getOutcome());
    }
}