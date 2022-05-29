package hf.ooad.dessert.topping;

public class Cherries extends Topping {
    public Cherries() {
        super("Cherries");
    }

    @Override
    public void serve() {
        System.out.println("serve Cherries topping");
    }
}
