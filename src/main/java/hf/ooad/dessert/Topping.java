package hf.ooad.dessert;

public class Topping {
    private String description;

    public void serve() {
        System.out.println("serve topping");
    }

    public class WhippedCream extends Topping {
        @Override
        public void serve() {
            System.out.println("serve WhippedCream topping");
        }
    }

    public class Nuts extends Topping {
        @Override
        public void serve() {
            System.out.println("serve Nuts topping");
        }
    }

    public class Cherries extends Topping {
        @Override
        public void serve() {
            System.out.println("serve Cherries topping");
        }
    }

}
