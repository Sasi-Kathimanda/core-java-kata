package hf.ooad.dessert.icecream;

public class Vanilla extends IceCream {
    public Vanilla() {
        super("Vanilla");
    }

    @Override
    public void serve() {
        System.out.println("serve Vanilla IceCream");
    }
}
