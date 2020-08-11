package codebat.map2;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WorldMultiple {
    public static void main(String[] args) {

        String[] list1 = new String[] {"a", "b", "a", "c", "b"};
        String[] list2 = new String[] {"c", "b", "a"};
        String[] list3 = new String[] {"c", "c", "c", "c"};

        System.out.println(wordMultiple(list1));
        System.out.println(wordMultiple(list2));
        System.out.println(wordMultiple(list3));

    }

    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Long> keyCount = Arrays.stream(strings).collect(
            Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<String, Boolean> result = keyCount.entrySet().stream().collect(
            Collectors.toMap(Map.Entry::getKey, v -> v.getValue() > 1L));
        return result;
    }
}
