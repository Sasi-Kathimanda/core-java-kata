package codebat.map2;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstChar {
    public static void main(String[] args) {
        String[] list1 = new String[]{"salt", "tea", "soda", "toast"};
        String[] list2 = new String[]{"aa", "bb", "cc", "aAA", "cCC", "d"};
        String[] list3 = new String[]{""};

        System.out.println(firstChar(list1));
        System.out.println(firstChar(list2));
        System.out.println(firstChar(list3));
    }

    public static Map<String, String> firstChar(String[] strings) {

        return Stream.of(strings).collect(Collectors.toMap(k -> k.length() == 0 ? "" : k.substring(0, 1), v -> v, (a1, a2) -> a1 + a2));
    }

}
