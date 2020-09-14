package streams.reducing;

import java.util.stream.IntStream;

/**
 *  elements in stream can be reduced by two methods reduce(), collect()
 */
public class StreamReduction {
    public static void main(String[] args) {

        //finding sum using peek
        System.out.println("finding sum using using peek");
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(intStream.peek(i-> System.out.format("%d",i)).sum());

        // finding sum using Streams reduce method
        System.out.println("finding sum using stream's reduce");
        intStream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(intStream.reduce((i,n) -> i+n).getAsInt());

        //finding max using  streams reduce
        System.out.println("finding max using stream's reduce");
        intStream = IntStream.of(1, 2, 3, 41, 5, 6, 7, 8, 9, 10);
        System.out.println(intStream.reduce((i,n) -> i > n ? i:n));
        System.out.println(intStream.reduce((i,n) -> Math.max(i, n))); // replacing Math.max
        System.out.println(intStream.reduce(Math::max)); // replacing Lambda Method Reference



        // finding sum using Streams sum method
        System.out.println("finding sum using stream's sum");
        intStream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(intStream.sum());


    }
}
