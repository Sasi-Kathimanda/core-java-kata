package hf.ooad.abstraction;

public abstract class Animal {
    abstract String sound();
    void sleep() {
        System.out.println("Zzzz");
    }
    protected Animal() {
    }
}
