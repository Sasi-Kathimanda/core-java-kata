package multithreading.volatilevsatomic;

public class UnsafeClassWithoutVolatile {
    boolean  done = false;

    public void loop() {
        System.out.println("loop started by " + Thread.currentThread().getName());
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("loop finished and setting done to true " + Thread.currentThread().getName());
        done = true;
    }

    public boolean isDone() {
        while (!done) {
            //busy wait
        };
        System.out.println("waiting  finished, exiting isDone " + Thread.currentThread().getName());
        return done;
    }
}
