package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by sasi-kathimanda on 17/12/16.
 */
public class IteratorsTransformation {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4);

        System.out.println("***** Version 1 *******");
        //V1: external Iterators
        for(int i = 0;i < 4;i++) {
            System.out.println(numbers.get(i));
        }


        System.out.println("***** Version 2 *******");
        //V2: still external Iterators
        for(int e : numbers) {
            System.out.println(e);
        }

        System.out.println("***** Version 3 *******");
        //V3: internal Iterators
        numbers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        System.out.println("***** Version 4 *******");
        //V4: mighty Lambdas Again
        numbers.forEach((Integer value) -> System.out.println(value));


        System.out.println("***** Version 5 *******");
        //V5 : lambdas removing type information  (i.e.,Type Inference)
        numbers.forEach(value -> System.out.println(value));

        //V6 : method references
        System.out.println("***** Version 6 *******");
        numbers.forEach(System.out::println);

    }
}
