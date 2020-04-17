package codebat.map2;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordZero {
    public static void main(String[] args) {
        String[] list1 = new String[]{"a", "b", "a", "b"};
        String[] list2 = new String[]{"a", "b", "a", "c", "b"};
        String[] list3 = new String[]{"c", "b", "a"};

        System.out.println(word0(list1));
        System.out.println(word0(list2));
        System.out.println(word0(list3));

    }

    public static Map<String, Integer> word0(String[] strings) {
        return Stream.of(strings).collect(Collectors.toMap(k->k,v->0,(a,a2)->a2));
    }

}
