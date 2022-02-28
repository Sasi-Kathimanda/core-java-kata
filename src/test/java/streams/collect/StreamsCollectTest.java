package streams.collect;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
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
}