package hf.ooad.dessert;

import hf.ooad.dessert.icecream.IceCream;
import hf.ooad.dessert.topping.Topping;

public class Cone extends Dessert {
    private IceCream iceCream;
    private Topping topping;

    public Cone() {
        super(null, null);
    }

    @Override
    Cone addTopping(Topping topping) {
        this.topping = topping;
        return this;
    }

    @Override
    Cone addScooping(IceCream iceCream) {
        this.iceCream = iceCream;
        return this;
    }

    public void serve() {
        System.out.println("serving Cone");
    }

    public IceCream getIceCream() {
        return iceCream;
    }

    public Topping getTopping() {
        return topping;
    }
}
