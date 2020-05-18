package codebat.map2;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Pairs {
    public static void main(String[] args) {
        String[] list1 = new String[]{"code", "bug"};
        String[] list2 = new String[]{"man", "moon", "main"};
        String[] list3 = new String[]{"man", "moon", "good", "night"};
        pairs(list1);
        pairs(list2);
        pairs(list3);
    }

    public static  Map<String, String> pairs(String[] strings) {
        Map<String, String> map = Stream.of(strings).
                collect(Collectors.toMap(k -> k.substring(0, 1), v -> v.substring(v.length() - 1),(k1,k2) ->k1));
        System.out.println( map);
        return map;
    }

}
