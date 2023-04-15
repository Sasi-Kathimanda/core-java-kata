package codebat.functional2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoZ {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("aaa", "bbb", "aza");
        List<String> list2 = Arrays.asList("hziz", "hzello", "hi");
        List<String> list3 = Arrays.asList("hello", "howz", "are", "youz");
        noZ(list1);
        noZ(list2);
        noZ(list3);
    }

    public static List<String> noZ(List<String> strings) {
        return strings.stream().filter(e -> e.contains("yy")).map(e -> e + "y").collect(Collectors.toList());
    }
}
