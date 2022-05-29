package hf.ooad.dessert.topping;

public class Topping {
    public String getDescription() {
        return description;
    }

    private final String description;

    public Topping(String description) {
        this.description = description;
    }

    public void serve() {
        System.out.println("serve topping");
    }
}
