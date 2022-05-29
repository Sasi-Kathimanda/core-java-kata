package hf.ooad.dessert;

public class IceCream {
    public String taste;

    public void serve() {
        System.out.println("serve IceCream");
    }

    public class Vanilla extends IceCream {
        @Override
        public void serve() {
            System.out.println("serve Vanilla IceCream");
        }
    }

    public class Straberry extends IceCream {
        @Override
        public void serve() {
            System.out.println("serve Strawberry IceCream");
        }
    }
}
