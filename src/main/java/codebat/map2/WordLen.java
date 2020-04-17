package codebat.map2;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordLen {
    public static void main(String[] args) {
        String[] list1 = new String[]{"a", "bb", "a", "bb"};
        String[] list2 = new String[]{"this", "and", "that", "and"};
        String[] list3 = new String[]{"code", "code", "code", "bug"};
        wordLen(list1);
        wordLen(list2);
        wordLen(list3);
    }

    public static Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = Stream.of(strings).collect(Collectors.toMap(Function.identity(),v -> v.length(),(a1, a2) -> a2));
        System.out.println(map);
        return map;
    }

}
