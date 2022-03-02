package generics;

import java.util.Collection;

public class GetAndPut {

    public double sum(Collection<? extends Number> nums) {
        double temp = 0.0;
        for (Number integer : nums) {
            temp +=integer.doubleValue();
        }
        return temp;
    }
}
