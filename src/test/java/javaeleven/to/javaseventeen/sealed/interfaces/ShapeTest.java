package javaeleven.to.javaseventeen.sealed.interfaces;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ShapeTest {

    @Test
    void circleInstanceShouldReturnedOfTypeShape() {
        Shape circleShape = new Circle();
        assertTrue(circleShape.getClass().getSimpleName().contains("Circle"));
    }
}