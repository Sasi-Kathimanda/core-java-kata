package hf.ooad.dessert.topping;

public class Nuts extends Topping {
    public Nuts() {
        super("Nuts");
    }

    @Override
    public void serve() {
        System.out.println("serve Nuts topping");
    }
}
