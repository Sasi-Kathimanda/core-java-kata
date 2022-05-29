package hf.ooad.dessert;

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

    public class WhippedCream extends Topping {
        public WhippedCream() {
            super("WhippedCream");
        }

        @Override
        public void serve() {
            System.out.println("serve WhippedCream topping");
        }
    }

    public class Nuts extends Topping {
        public Nuts() {
            super("Nuts");
        }

        @Override
        public void serve() {
            System.out.println("serve Nuts topping");
        }
    }

    public class Cherries extends Topping {
        public Cherries() {
            super("Cherries");
        }

        @Override
        public void serve() {
            System.out.println("serve Cherries topping");
        }
    }

}
