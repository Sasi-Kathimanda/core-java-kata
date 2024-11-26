package streams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StreamsCreationTest {
    StreamsCreation streamsCreation;

    @BeforeEach
    void setUp() {
        streamsCreation = new StreamsCreation();
    }

    @Test
    void createStreamFromList() {
        //when
        Stream<String> result = streamsCreation.createStreamFromList("namasthey", "anna", "manchiga", "vunnava");
        //then
        assertEquals(4, result.count());
    }

    @Test
    void createStreamFromStreamOf() {
        //when
        Stream<String> result = streamsCreation.createStreamFromStreamOf("namasthey", "anna", "manchiga", "vunnava");
        //then
        assertEquals(4, result.count());
    }

    @Test
    void createStreamFromStringArray() {
        //when
        Stream<String> result = streamsCreation.createStreamFromStringArray(new String[]{"namasthey", "anna", "manchiga", "vunnava"});
        //then
        assertEquals(4, result.count());
    }
}