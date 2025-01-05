package multithreading.volatilevsatomic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AtomicProblemExecutor {
    public static void main(String[] args) throws InterruptedException {
        int noOfThreads = 5;
        var iterations = 10;
        UnsafeClassWithoutAtomicInteger unsafeInstance = new UnsafeClassWithoutAtomicInteger();
        ExecutorService executorsPool = Executors.newFixedThreadPool(noOfThreads);
        for (int i = 0; i < noOfThreads; i++) {
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
