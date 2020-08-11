package streams.reducing;

import java.util.stream.IntStream;

/**
 *  elements in stream can be reduced by two methods reduce(), collect()
 */
public class StreamReduction {
    public static void main(String[] args) {

        //finding sum using peek
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.format("\n%d",intStream.peek(s -> System.out.format("%d",s)).sum());

        // finding sum using Streams sum method
        System.out.println("finding sum using stream's sum");
        IntStream intStream2 = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(intStream2.sum());


    }
}
