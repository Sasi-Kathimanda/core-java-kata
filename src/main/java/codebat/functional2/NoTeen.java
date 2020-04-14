package codebat.functional2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoTeen {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(12, 13, 19, 20);
        List<Integer>  list2 = Arrays.asList(1, 14, 1);
        List<Integer>  list3 = Arrays.asList(15);
        noTeen(list1);
        noTeen(list2);
        noTeen(list3);
    }

    public static List<Integer> noTeen(List<Integer> nums) {
        return  nums.stream().filter( e -> !(e >= 13 && e <= 19)).collect(Collectors.toList());
    }
}
