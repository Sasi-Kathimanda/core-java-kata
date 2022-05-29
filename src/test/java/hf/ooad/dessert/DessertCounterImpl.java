package hf.ooad.dessert;

import hf.ooad.dessert.icecream.IceCream;
import hf.ooad.dessert.topping.Topping;

public class DessertCounterImpl implements DessertCounter {
    @Override
    public Cone orderCone(IceCream iceCream, Topping topping) {
        return new Cone()
                .addScoop(iceCream)
                .addTopping(topping);
    }

    @Override
    public Sundae orderSundae(IceCream iceCream, Topping topping, Syrup syrup) {
        return null;
    }

    @Override
    public Cone addTopping(Cone cone, Topping topping) {
        return null;
    }

    @Override
    public Dessert addTopping(Sundae dessert, Topping topping) {
        return null;
    }
}
