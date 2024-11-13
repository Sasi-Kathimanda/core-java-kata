package streams;

import java.util.List;

public class MultiThreadUsingStream {
    public int calculateSumUsingStream(List<Integer> integerList) {
        return integerList.stream()
                .mapToInt(e -> e*e)
                .sum();
    }
}
