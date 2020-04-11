package streams;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsCreation {
    public static void main(String[] args) {
        
        // 1 st way
        List<String> words = Arrays.asList("namasthey", "anna", "manchiga", "vunnava");
        Stream<String> stream1 = words.stream();
        System.out.println(stream1.count());
        
        //2nd way
        Stream<String> stream2 = Stream.of("namasthey", "anna", "manchiga","vunnava");
        System.out.println(stream2.count());

        
        //3rd way
        String[] words2 = {"namasthey", "anna", "manchiga","vunnava"};
        Stream<String> stream3 =  Stream.of(words2);
        System.out.println(stream3.count());


        int[] nums = {1, 2, 3, 4, 5};

        System.out.println(Stream.of(nums).count()); // It prints 1!

        Integer[] nums2 = {1, 2, 3, 4, 5};
        System.out.println(Stream.of(nums2).count()); //



    }
}
