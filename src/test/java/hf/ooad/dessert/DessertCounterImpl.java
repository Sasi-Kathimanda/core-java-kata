package hf.ooad.dessert;

import hf.ooad.dessert.icecream.IceCream;
import hf.ooad.dessert.topping.Topping;

public class DessertCounterImpl implements DessertCounter {
    private Dessert dessert;
    @Override
    public Dessert orderDessert(Dessert dessert) {
        return  dessert;
    }
}
