package hf.ooad.dessert;

import hf.ooad.dessert.icecream.IceCream;
import hf.ooad.dessert.topping.Topping;

public class Cone extends Dessert {
    private IceCream iceCream;
    private Topping topping;

    public Cone addScoop(IceCream iceCream) {
        this.iceCream = iceCream;
        return this;
    }

    public Cone addTopping(Topping topping) {
        this.topping = topping;
        return this;
    }

    public void serve() {
        System.out.println("serving cone");
    }

    public IceCream getIceCream() {
        return iceCream;
    }

    public Topping getTopping() {
        return topping;
    }
}
