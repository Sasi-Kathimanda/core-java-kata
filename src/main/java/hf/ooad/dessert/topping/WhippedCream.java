package hf.ooad.dessert.topping;

public class WhippedCream extends Topping {
    public WhippedCream() {
        super("WhippedCream");
    }

    @Override
    public void serve() {
        System.out.println("serve WhippedCream topping");
    }
}
