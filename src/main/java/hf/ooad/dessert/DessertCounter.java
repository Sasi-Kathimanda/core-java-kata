package hf.ooad.dessert;

public interface DessertCounter {
    Cone cone = new Cone();

    Cone orderCone(IceCream iceCream, Topping topping);

    Sundae orderSundae(IceCream iceCreams, Topping toppings, Syrup syrups);

    Cone addTopping(Cone cone, Topping topping);

    Dessert addTopping(Dessert dessert, Topping topping);
}
