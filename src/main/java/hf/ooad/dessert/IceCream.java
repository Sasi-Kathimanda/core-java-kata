package hf.ooad.dessert;

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

    public class Vanilla extends IceCream {
        public Vanilla() {
            super("Vanilla");
        }

        @Override
        public void serve() {
            System.out.println("serve Vanilla IceCream");
        }
    }

    public class Strawberry extends IceCream {
        public Strawberry() {
            super("Strawberry");
        }

        @Override
        public void serve() {
            System.out.println("serve Strawberry IceCream");
        }
    }
}
