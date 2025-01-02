package multithreading.volatilevsatomic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VolatileProblemExecutor {
    public static void main(String[] args) {
        UnsafeClassWithoutVolatile unsafeInstance = new UnsafeClassWithoutVolatile();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        try {
            executorService.submit(unsafeInstance::loop);
            executorService.submit(() -> System.out.println("isDone: " + unsafeInstance.isDone()));
        } finally {
            executorService.shutdown();
        }
    }
}
