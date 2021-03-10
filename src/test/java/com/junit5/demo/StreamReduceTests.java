package com.junit5.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StreamReduceTests {
    @Test
    @DisplayName("GivenInts_ThenFindSumUsingReduce")
    void givenIntsThenFindSumUsingReduce() {
        var intStream = IntStream.of(1,2,3,4,5,6,7,8,9,10);
        assertEquals(55,intStream.reduce((i,n) -> i+n).getAsInt());
    }

}
