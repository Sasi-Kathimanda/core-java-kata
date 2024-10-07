package streams.collect;

import java.util.List;

public class StreamsCompare {

    public boolean compareList(List<String> list1, List<String> list2) {
        return list1.stream().allMatch(e1 -> list2.stream().anyMatch(e1::equalsIgnoreCase));
    }
}
