package multithreading;

import lombok.AllArgsConstructor;
import java.time.LocalDateTime;
import java.util.concurrent.Callable;

@AllArgsConstructor
public class Task implements Callable<Result> {
    String name;

    @Override
    public Result call() throws Exception {
        long duration = (long) (Math.random() * 10);
        System.out.println(String.format("waiting for duration %d and task name = %s", duration, name));
        Thread.sleep(duration);
        return new Result(this.name, LocalDateTime.now());
    }
}
