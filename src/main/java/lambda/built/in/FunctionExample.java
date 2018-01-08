package lambda.built.in;

import java.util.function.Function;

public class FunctionExample {

    // 1.using normal Method
    static void roundItUsingMethod(Double d , Function<Double, Long> f )  {
        Long result = f.apply(d);
        System.out.println(result);
    }

    //2.using Anonymous class
    static Function<Double,Long> functionUsingAnonymousClazz = new Function<Double, Long>() {
        @Override
        public Long apply(Double aDouble) {
            return Math.round(aDouble);
        }
    } ;

    //3. using Lambda
    static Function<Double,Long> functionUsingLambda = aDouble -> Math.round(aDouble);


    public static void main(String[] args) {

        roundItUsingMethod(5.4, aDouble -> Math.round(aDouble));

        System.out.println(functionUsingAnonymousClazz.apply(5.4));

        System.out.println(functionUsingLambda.apply(5.4));


        Function<String, String> f1 = s -> s.toUpperCase();
        Function<String, String> f2 = String::toLowerCase;

        System.out.println(f2.compose(f1).apply("Compose"));
        System.out.println(f2.andThen(f2).apply("AndThen"));


    }

}
