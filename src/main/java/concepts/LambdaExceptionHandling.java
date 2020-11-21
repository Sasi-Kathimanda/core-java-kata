package concepts;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaExceptionHandling {
  public static void main(String[] args) {
    // Handling checked Exception
    Stream<Integer> ints = Stream.of(1, 2, 3, 4, 5);
    ints.map(LambdaExceptionHandling::sleep)
        .collect(Collectors.toList());
  }

  private static Integer sleep(Integer t) {
    try {
      Thread.sleep(1);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    return t + 1;
  }
}