package codebat.functional2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Square56 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(3, 1, 4);
        List<Integer> list2 = Arrays.asList(1);
        List<Integer> list3 = Arrays.asList(2);
        square56(list1);
        square56(list2);
        square56(list3);
    }

    public static List<Integer> square56(List<Integer> nums) {
        List<Integer> list = nums.stream().map(e -> (e * e) + 10).filter(e -> !(e % 10 == 5 || e % 10 == 6)).collect(
                Collectors.toList());
        System.out.println(list);
        return list;
    }

}
