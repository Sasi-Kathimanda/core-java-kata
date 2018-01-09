package lambda.built.in;

import java.util.function.UnaryOperator;

/**
 * Definition: UnaryOperator is just a specialization of the Function interface (in fact, this interface extends from it)
 * for when the argument and the result are of the same type.
 */
public class UnaryOperatorExample {

    public static void main(String[] args) {

        //using Anonymous class
        UnaryOperator<String> unaryOperatorUsingAnonymousClazz = new UnaryOperator<String>() {
            @Override
            public String apply(String s) {
                return s.substring(0,2);
            }
        };

        System.out.println(unaryOperatorUsingAnonymousClazz.apply("Hi123"));

        //using Lambda
        UnaryOperator<String> unaryOperatorUsingLambda = s -> s.substring(0,2);
        System.out.println(unaryOperatorUsingLambda.apply("Hi123"));
    }
}
