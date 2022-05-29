package hf.ooad.dessert;

import hf.ooad.dessert.icecream.IceCream;
import hf.ooad.dessert.topping.Topping;
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

        Dessert dessert = sut.orderDessert(new Cone().addScooping(new IceCream("Strawberry")).addTopping(new Topping("WhippedCream")));
        assertEquals("Strawberry", dessert.getIceCream().getTaste());
        assertEquals("WhippedCream", dessert.getTopping().getDescription());
    }

    @Test
    void givenASundae_IceCreamChoiceWithToppingChoice_WouldGetCone() {

        Dessert dessert = sut.orderDessert(new Sundae().addScooping(new IceCream("Strawberry")).addTopping(new Topping("WhippedCream")).addSyrup(new Syrup("HotFudge")));
        assertEquals("Strawberry", dessert.getIceCream().getTaste());
        assertEquals("WhippedCream", dessert.getTopping().getDescription());
        assertEquals("HotFudge", ((Sundae) dessert).getSyrup().getDescription());
    }
}