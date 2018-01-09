package lambda.built.in;

import java.util.function.BiConsumer;

/**
 *  Biconsumer represents the consumer that take two arguments and don't return a result.
 */
public class BiConsumerExample {

    public static void main(String[] args) {

        //using anonymous clazz
        BiConsumer<String,String> biConsumerUsingAnonymousClazz = new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println( s +" "+ s2 );
            }
        };

        biConsumerUsingAnonymousClazz.accept("Hi" , "There");

        //using lambda
        BiConsumer<String,String> biConsumerUsingLambda = (s1,s2) -> System.out.println(s1+" "+s2);
        biConsumerUsingLambda.accept("Hi", "There");
    }
}
