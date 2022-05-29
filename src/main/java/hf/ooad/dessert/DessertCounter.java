package hf.ooad.dessert;

import hf.ooad.dessert.icecream.IceCream;
import hf.ooad.dessert.topping.Topping;

public interface DessertCounter {
    Cone cone = new Cone();

    Cone orderCone(IceCream iceCream, Topping topping);

    Sundae orderSundae(IceCream iceCreams, Topping toppings, Syrup syrups);

    Cone addTopping(Cone cone, Topping topping);

    Dessert addTopping(Sundae sundae, Topping topping);
}
