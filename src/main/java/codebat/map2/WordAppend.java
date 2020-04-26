package codebat.map2;

import java.util.HashMap;
import java.util.Map;

public class WordAppend {
    public static void main(String[] args) {
        String[] list1 = new String[]{"this", "or", "that", "and", "this", "and", "that"};
        String[] list2 = new String[]{"xx", "xx", "yy", "xx", "zz", "yy", "zz", "xx"};
        String[] list3 = new String[]{"a", "b", "c"};

        System.out.println(wordAppend(list1));
        System.out.println(wordAppend(list2));
        System.out.println(wordAppend(list3));

    }

    public static String wordAppend(String[] strings) {
        StringBuilder result = new StringBuilder();
        Map<String, Integer> tempMap = new HashMap<>();
        for (String s: strings) {
            if(tempMap.containsKey(s)) {
                tempMap.put(s, tempMap.get(s)+1);
                if(tempMap.get(s) % 2 == 0) {
                    result.append(s);
                }
            } else {
                tempMap.put(s, 1);
            }
        }
        return result.toString();
    }

}
