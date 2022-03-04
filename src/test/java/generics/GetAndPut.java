package generics;

import java.util.Collection;
import java.util.List;

public class GetAndPut {

    public double sum(Collection<? extends Number> nums) {
        double temp = 0.0;
        for (Number integer : nums) {
            temp += integer.doubleValue();
        }
        return temp;
    }

    public void count(Collection<? super Integer> ints, int count) {
        for (int i = 0; i < count; i++) {
            ints.add(i);
        }
    }

    public double sumCount(List<Integer> ints, int i) {
        return 0.0;
    }
}
