package hf.ooad.dessert;

import hf.ooad.dessert.icecream.IceCream;
import hf.ooad.dessert.topping.Topping;

public class Sundae extends Dessert {
    private IceCream iceCream;
    private Topping topping;
    private Syrup syrup;

    public Sundae() {
        super(null, null);
    }
    @Override
    public Sundae addTopping(Topping topping) {
        this.topping = topping;
        return this;
    }
    @Override
    public Sundae addScooping(IceCream iceCream) {
        this.iceCream = iceCream;
        return this;
    }

    public Sundae addSyrup(Syrup syrup) {
        this.syrup = syrup;
        return this;
    }

    @Override
    public void serve() {
        System.out.println("serving Sundae");
    }

    public Syrup getSyrup() {
        return syrup;
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
