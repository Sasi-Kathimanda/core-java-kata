package javaeleven.to.javaseventeen.sealed.interfaces;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ShapeTest {

    @Test
    void circleInstanceShouldReturnedOfTypeShape() {
        Shape circleShape = new Circle();
        assertTrue(circleShape.getClass().getSimpleName().contains("Circle"));
    }
}