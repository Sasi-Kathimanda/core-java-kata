package streams;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsCreation {
    public static void main(String[] args) {

        // 1 st way
        //createStreamFromList();

        //2nd way
        //createStreamFromStreamOf()


        //3rd way
        //createStreamFromStringArray()


        int[] nums = {1, 2, 3, 4, 5};

        System.out.println(Stream.of(nums).count()); // It prints 1!

        Integer[] nums2 = {1, 2, 3, 4, 5};
        System.out.println(Stream.of(nums2).count()); //


    }

    public Stream<String> createStreamFromList(String... input) {
        List<String> words = Arrays.asList(input);
        return words.stream();
    }

    public Stream<String> createStreamFromStreamOf(String... input) {
        return Stream.of(input);
    }

    public Stream<String> createStreamFromStringArray(String[] input) {
        return Stream.of(input);
    }
}

