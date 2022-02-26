package streams.collect;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

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
}