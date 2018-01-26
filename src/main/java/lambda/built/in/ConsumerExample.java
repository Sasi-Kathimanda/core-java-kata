package lambda.built.in;

import java.util.function.Consumer;

/**
 *  Definition: A Consumer is an operation that accepts a single input argument and returns no result; it just execute some operations on the argument.
 *  Method Signature: T -> void
 */
public class ConsumerExample {

    public static void main(String[] args) {

        //  using anonymous class Consumer
        Consumer<String> consumerStrUsingAnonymous = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        consumerStrUsingAnonymous.accept("Hi");

        //  using Lambda
        Consumer<String> consumerStr = t -> System.out.println(t+" First");

        Consumer<String> consumerStrSecond = t -> System.out.println(t+" Second");

        consumerStr.andThen(consumerStrSecond).accept("Hi");
    }
}
