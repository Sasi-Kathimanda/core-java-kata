package codebat.map2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class WordAppend {
    public static void main(String[] args) {
        String[] list1 = new String[]{"a", "b", "a"};
        String[] list2 = new String[]{"a", "b", "a", "c", "a", "d", "a"};
        String[] list3 = new String[]{"a", "", "a"};

        System.out.println(wordAppend(list1));
        System.out.println(wordAppend(list2));
        System.out.println(wordAppend(list3));

    }

    public static String wordAppend(String[] strings) {
        String result = "";

        for (int i = 2; i< strings.length ; i++) {
            if(i%2 == 0) {
                System.out.println("i="+i);
                result += strings[i];
            }
        }
        return result;
    }

}
