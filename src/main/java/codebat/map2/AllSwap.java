package codebat.map2;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class AllSwap {
    public static void main(String[] args) {
        String[] list1 = new String[]{"ab", "ac"};
        String[] list2 = new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        String[] list3 = new String[]{"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"};

        Stream.of(allSwap(list1)).forEach(System.out::println);
        Stream.of(allSwap(list2)).forEach(System.out::println);
        Stream.of(allSwap(list3)).forEach(System.out::println);

    }

    public static String[] allSwap(String[] strings) {
        Map<String, Integer> tempMap = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String currentElementFirstCharacter = strings[i].substring(0, 1);
            if (tempMap.containsKey(currentElementFirstCharacter)) {
                String temp = strings[i];
                String matched = strings[tempMap.get(currentElementFirstCharacter)];
                strings[i] = matched;
                strings[tempMap.get(currentElementFirstCharacter)] = temp;
                tempMap.remove(currentElementFirstCharacter);
            } else {
                tempMap.put(currentElementFirstCharacter, i);
            }
        }
        return strings;
    }
}
