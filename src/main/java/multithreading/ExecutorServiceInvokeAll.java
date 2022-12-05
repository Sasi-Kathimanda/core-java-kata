package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceInvokeAll {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newFixedThreadPool(20);
        List<Task> tasks = new ArrayList<>();
        for (int i = 0; i <= 5000; i++) {
            tasks.add(new Task("taskName-" + i));
        }

        var futures = service.invokeAll(tasks);
        for (Future<Result> future : futures) {
            System.out.println(String.format("1) Task name = %s , 2) duration =  %s ", future.get().getName(), future.get().getDuration()));
        }
        service.shutdown();
    }
}
