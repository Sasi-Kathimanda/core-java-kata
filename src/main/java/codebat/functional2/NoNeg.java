package codebat.functional2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoNeg {
    public static void main(String[] args) {
        List<Integer>  list1 = Arrays.asList(1,-2);
        List<Integer>  list2 = Arrays.asList(-3,-3,3,3);
        List<Integer>  list3 = Arrays.asList(-1,-1,-1);
        noNeg(list1);
        noNeg(list2);
        noNeg(list3);

    }

    public static List<Integer> noNeg(List<Integer> nums) {
        return nums.stream().filter( e -> e >= 0).collect(Collectors.toList());
    }

}
