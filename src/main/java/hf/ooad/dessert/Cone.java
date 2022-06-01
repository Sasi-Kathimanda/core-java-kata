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

    @Override
    public void serve() {
        System.out.println("serving Cone");
    }

    @Override
    public IceCream getIceCream() {
        return iceCream;
    }

    @Override
    public Topping getTopping() {
        return topping;
    }
}
