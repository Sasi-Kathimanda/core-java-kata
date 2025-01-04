package multithreading.volatilevsatomic;

public class UnsafeClassWithoutAtomicInteger {
    private int counter;

    public void increment() {
        this.counter++;

    }
    public int get() {
        return counter;
    }
}
