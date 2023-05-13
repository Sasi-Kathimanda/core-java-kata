package programming.challenges;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingTest {
    public static void main(String[] args) {
        System.out.println(getFirstNonRepeatingCharacter("Sasi.Kathimanda"));
    }

    private static char getFirstNonRepeatingCharacter(String input) {
        Map<Character, Long> map = input.chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        map.forEach((key, value) -> System.out.println(key + "-" + value));
        Optional<Character> result = map.entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey).findFirst();
        return result.orElse((char) 1);
    }
}
