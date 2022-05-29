package hf.ooad.dessert;

import hf.ooad.dessert.icecream.IceCream;
import hf.ooad.dessert.topping.Topping;

public class Sundae extends Dessert {
    private IceCream[] iceCreams;
    private Topping[] toppings;
    private Syrup[] syrups;

    public void addScoop(IceCream iceCream) {

    }

    public void addTopping(Topping topping) {

    }

    public void addSyrup(Syrup syrup) {

    }

    public void serve() {
        System.out.println("serving cone");
    }
}
