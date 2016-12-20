package method.reference;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sasi-kathimanda on 18/12/16.
 */
public class MethodReferencesDifferentOptions {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        System.out.println("**** parameter as an argument ****");
       // rather numbers.forEach(e -> System.out.println(e));
        numbers.forEach(System.out::println); // where println is INSTANCE method

        System.out.println("**** parameter as an argument to static method ****");
        numbers.stream()
               //rather  .map(e -> String.valueOf(e))
                .map(String::valueOf) //where valueOf is STATIC method
                .forEach(System.out::println);

        System.out.println("**** parameter as a target ****");
        numbers.stream()
               //rather .map(e -> e.valueOf(e))
                .map(Integer::valueOf)
                .forEach(System.out::println);

        System.out.println("**** two parameters as an argument ****");
        System.out.println(
//        numbers.stream()
//                .reduce(0, (total,e) -> Integer.sum(total,e))
          numbers.stream()
                .reduce(0,Integer::sum)
        );

        System.out.println("**** two parameters,one as target the other as an argument. ****");
        System.out.println(
        numbers.stream()
                .map(String::valueOf)
               //rather .reduce("",(carry,str) -> carry.concat(str))
                .reduce("",String::concat)
        );


    }
}
