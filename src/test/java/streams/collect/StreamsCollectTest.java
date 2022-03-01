package streams.collect;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class StreamsCollectTest {
    private StreamsCollect sut;

    @BeforeEach
    void setUp() {
        sut = new StreamsCollect();
    }

    @Test
    void convertDifferentTypesToLists() {
        List<Integer> ints = sut.convertFromTypeToList(1, 2, 3, 4, 5);
        List<String> strings = sut.convertFromTypeToList("Sasi", "Kiran", "Aashi", "Aaru");
        assertEquals("[1, 2, 3, 4, 5]", ints.toString());
        assertEquals("[Sasi, Kiran, Aashi, Aaru]",strings.toString());
    }

    @Test
    void getJoinsOfStreamOfStingsWillJoinWithPrefixes() {
        String result = sut.getJoinsOfStreamOfStings("-", "<", ">", "This", "is", "a", "String");
        assertEquals("<This-is-a-String>", result);
    }

    @Test
    void doubleTheValuesAndConvertToAMap() {
        Map<Integer, Integer> actualMap = sut.doubleTheValuesAndConvertToAMap(1, 2, 3, 4, 5);
        Map<Integer, Integer> expectedMap = Map.of(1, 2, 2, 4, 3, 6, 4, 8, 5, 10);
        assertEquals(expectedMap, actualMap);
    }

    @Test
    void getGroupAgeBy10() {
        Map<Integer, List<Integer>> actualMap = sut.getMapOfGroupBy10(2, 18, 25, 36, 35, 51, 54, 62, 68, 72, 78, 85);
        Map<Integer, List<Integer>> expectedMap = Map.of(0, List.of(2),
                10, List.of(18),
                20, List.of(25),
                30, List.of(36, 35),
                50, List.of(51, 54),
                60, List.of(62, 68),
                70, List.of(72, 78),
                80, List.of(85));
        assertEquals(expectedMap, actualMap);
    }
}