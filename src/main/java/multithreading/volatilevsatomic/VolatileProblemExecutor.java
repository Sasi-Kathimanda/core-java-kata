package multithreading.volatilevsatomic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VolatileProblemExecutor {
    public static void main(String[] args) {
        UnsafeClassWithoutVolatile unsafeInstance = new UnsafeClassWithoutVolatile();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        try {
            // this will fire one thread try set done to true
            executorService.submit(unsafeInstance::loop);
            // this will fire another thread to check if done is true
            executorService.submit(() -> System.out.println("isDone: " + unsafeInstance.isDone()));
        } finally {
            executorService.shutdown();
        }
    }
}
