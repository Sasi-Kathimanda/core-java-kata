package hf.ooad.dessert;

import hf.ooad.dessert.icecream.IceCream;
import hf.ooad.dessert.topping.Topping;

public abstract class Dessert {
    private final Topping topping;
    private final IceCream iceCream;

    protected Dessert(Topping topping, IceCream iceCream) {
        this.topping = topping;
        this.iceCream = iceCream;
    }

    abstract Dessert addTopping(Topping topping);

    abstract Dessert addScooping(IceCream iceCream);

    public void serve() {
        System.out.println("serving desert");
    }

    public IceCream getIceCream() {
        return iceCream;
    }

    public Topping getTopping() {
        return topping;
    }
}
