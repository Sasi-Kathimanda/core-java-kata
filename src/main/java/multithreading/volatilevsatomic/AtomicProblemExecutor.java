package multithreading.volatilevsatomic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AtomicProblemExecutor {
    public static void main(String[] args) throws InterruptedException {
        int no_of_threads = 5;
        var iterations = 10;
        UnsafeClassWithoutAtomicInteger unsafeInstance = new UnsafeClassWithoutAtomicInteger();
        ExecutorService executorsPool = Executors.newFixedThreadPool(no_of_threads);
        for (int i = 0; i < no_of_threads; i++) {
            executorsPool.submit(() -> {
                for (int j = 0; j < iterations; j++) {
                    unsafeInstance.increment();

                }
            });
        }
        Thread.sleep(1000);
        System.out.println(unsafeInstance.get());
        executorsPool.shutdown();
    }
}
