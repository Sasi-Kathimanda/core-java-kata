package hf.ooad.dessert;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DessertCounterTest {
    DessertCounter sut;

    @BeforeEach
    void setUp() {
        sut = new DessertCounterImpl();
    }

    @Test
    void givenACone_IceCreamChoiceWithToppingChoice_WouldGetCone() {
        Cone cone = sut.orderCone(new IceCream("Strawberry"), new Topping("WhippedCream"));
        assertEquals("Strawberry", cone.getIceCream().getTaste());
        assertEquals("WhippedCream", cone.getTopping().getDescription());
    }
}