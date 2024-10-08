package streams.collect;

import java.util.List;
import java.util.Objects;

public class StreamsCompare {

    public boolean compareList(List<String> list1, List<String> list2) {
        return list1.stream()
                .allMatch(e1 -> list2.stream()
                        .anyMatch(e1::equalsIgnoreCase)
                );
    }

    public boolean compareListWithHavingNulls(List<String> list1, List<String> list2) {
        return list1.stream()
                .filter(Objects::nonNull)
                .allMatch(e1 -> list2.stream()
                        .filter(Objects::nonNull)
                        .anyMatch(e2 -> e2.equalsIgnoreCase(e1))
                );
    }
}
