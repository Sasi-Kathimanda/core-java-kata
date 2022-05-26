package codebat.map2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
public class CountMapper {
    private static String getCountedValues(List<String> input) {
        AtomicReference<StringBuilder> result = new AtomicReference<>(new StringBuilder());
        if (input.isEmpty()) {
            return "";
        }
        Map<String, Integer> countMap = new HashMap<>();
        int count = 0;
        input.stream().forEach((s) -> {
            if (countMap.containsKey(s)) {
                Integer val = countMap.get(s);
                countMap.put(s, ++val);
                result.updateAndGet(v -> v.append(result));
            } else {
                countMap.put(s, 1);
            }
        });

        final Map<String, Integer> sortedMap = countMap.entrySet().stream()
            .sorted(Map.Entry.comparingByValue())
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        sortedMap.forEach((k,v) -> {
            if (v >= 2) {
                int num = v /2;
                for (int i=0; i<num; i++){
                    result.get().append(k);
                }
            }
        });
        return result.toString();
    }
    public static void main(String[] args) {
        List<String> input = Arrays.asList("this", "or", "that", "and", "this", "and", "that");
        System.out.println(getCountedValues(input));
    }
}