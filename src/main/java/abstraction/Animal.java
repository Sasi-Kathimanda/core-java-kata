package abstraction;

public abstract class Animal {
    abstract String sound();

    String sleep() {
        return "Zzzz";
    }

    protected Animal() {
    }
}
