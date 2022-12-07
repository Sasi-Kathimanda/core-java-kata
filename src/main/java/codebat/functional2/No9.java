package codebat.functional2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class No9 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(2, 2, 19);
        List<Integer> list2 = Arrays.asList(9, 19, 29, 3);
        List<Integer> list3 = Arrays.asList(7, 2, 3);
        no9(list1);
        no9(list2);
        no9(list3);
    }

    public static void no9(List<Integer> nums) {
        System.out.println(nums.stream()
                .filter(e -> e >= 0)
                .filter(e -> e % 10 != 9)
                .collect(Collectors.toList()));
    }


}
