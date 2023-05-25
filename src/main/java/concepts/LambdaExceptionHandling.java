package concepts;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaExceptionHandling {
    public static void main(String[] args) {

        // Handling checked exception
        Stream<Integer> ints = Stream.of(1, 2, 3, 4, 5);
        System.out.println(ints.map(LambdaExceptionHandling::sleep).collect(Collectors.toList()));

        // handling unchecked exception
        List<Integer> intList = Arrays.asList(1, 2, 3, 4);
        int key = 2;
        process(intList, key, (k, v) -> System.out.println("k/v = " + k / v));
    }

    private static void process(
            List<Integer> intList, int key, BiConsumer<Integer, Integer> consumer) {
        for (int i : intList) {
            try {
                consumer.accept(i, key);
            } catch (ArithmeticException ae) {
                System.out.println("Arithmetic Exception Thrown");
            }
        }
    }

    private static Integer sleep(Integer t) {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            System.out.println("e = " + e);
        }
        return t + 1;
    }
}
