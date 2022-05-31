package streams.collect;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

    @Test
    void getCountOfNumberOfDecades() {
        Map<Integer, Long> actualMap = sut.groupByMapComposedCollector(2, 18, 25, 36, 35, 51, 54, 62, 68, 72, 78, 85);
        Map<Integer, Long> expectedMap = Map.of(0, 1L,
                10, 1L,
                20, 1L,
                30, 2L,
                50, 2L,
                60, 2L,
                70, 2L,
                80, 1L);
        assertEquals(expectedMap, actualMap);
    }

    @Test
    void getCountOfNumberOfDecadesByOrder() {
        Map<Integer, Long> actualMap = sut.groupByMapResultOrdered(2, 18, 25, 36, 35, 51, 54, 62, 68, 72, 78, 85);
        Map<Integer, Long> expectedMap = Map.of(0, 1L,
                10, 1L,
                20, 1L,
                30, 2L,
                50, 2L,
                60, 2L,
                70, 2L,
                80, 1L);
        assertEquals(expectedMap, actualMap);
        assertEquals("[0, 10, 20, 30, 50, 60, 70, 80]", actualMap.keySet().toString());
    }

    @Test
    void getPartitionMap() {
        Map<Boolean, List<Integer>> partitionMap = sut.getPartitionMap(1, 9, 18, 18, 25, 32, 45, 56, 65, 72);
        assertEquals("[1, 9, 18, 18, 25, 32, 45]", partitionMap.get(true).toString());
        assertEquals("[56, 65, 72]", partitionMap.get(false).toString());
    }

    @Test
    void getPartitionMapComposedCollector() {
        Map<Boolean, Set<Integer>> partitionMapComposedCollector = sut.getPartitionMapComposedCollector(1, 9, 18, 18, 25, 32, 45, 56, 65, 72);
        assertEquals("[32, 1, 18, 9, 25, 45]", partitionMapComposedCollector.get(true).toString());
        assertEquals("[65, 56, 72]", partitionMapComposedCollector.get(false).toString());
    }
}