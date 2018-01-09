package lambda.built.in;

import java.util.function.BiPredicate;

/**
 *  Binary Predicate Represents Predicate with two arguments
 *
 */
public class BiPredicateExample {
    public static void main(String[] args) {

        //using Anonymous class
        BiPredicate<Integer,Integer> biPredicateUsingAnonymousClazz = new BiPredicate<Integer,Integer>() {

            @Override
            public boolean test(Integer integer, Integer integer2) {
                return integer % integer2 == 0;
            }
        } ;

        System.out.println( biPredicateUsingAnonymousClazz.test(10,5) );


        //using Lambda

        BiPredicate<Integer,Integer> biPredicateUsingLamda = (i1,i2) -> i1 % i2 == 0;

        System.out.println(biPredicateUsingLamda.test(10,5));
    }
}
