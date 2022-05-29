package hf.ooad.dessert.icecream;

public class Strawberry extends IceCream {
    public Strawberry() {
        super("Strawberry");
    }

    @Override
    public void serve() {
        System.out.println("serve Strawberry IceCream");
    }
}
