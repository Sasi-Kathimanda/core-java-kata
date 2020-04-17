package codebat.map2;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCount {

    public static void main(String[] args) {
        String[] list1 = new String[]{"a", "b", "a", "b"};
        String[] list2 = new String[]{"a", "b", "a", "c", "b"};
        String[] list3 = new String[]{"c", "b", "a"};
        System.out.println(wordCount(list1));
        System.out.println(wordCount(list2));
        System.out.println(wordCount(list3));

    }

    public static Map<String, Integer> wordCount(String[] strings) {
        Map<String, Long> stringLongMap = Arrays.stream(strings)
                .collect(Collectors.groupingBy(t->t, Collectors.counting()));
        return stringLongMap.entrySet().stream().collect(Collectors.toMap(e -> e.getKey(), e -> Math.toIntExact(e.getValue())));
    }

}
