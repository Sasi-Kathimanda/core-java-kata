package hf.ooad.dessert.icecream;

public class IceCream {
    public IceCream(String taste) {
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public String taste;

    public void serve() {
        System.out.println("serve IceCream");
    }

}
