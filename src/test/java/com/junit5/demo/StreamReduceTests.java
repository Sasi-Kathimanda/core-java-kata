package com.junit5.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StreamReduceTests {
    @Test
    @DisplayName("GivenInts_ThenFindSumUsingReduce")
    void givenIntsThenFindSumUsingReduce() {
        var intStream = IntStream.of(1,2,3,4,5,6,7,8,9,10);
        assertEquals(55,intStream.reduce((i,n) -> i+n).getAsInt());
    }
    @Test
    @DisplayName("GivenInts_ThenFindMaxUsingReduce")
    void givenIntsThenFindMaxUsingReduce() {
        var intList = List.of(45,28,63,56,3,9);
        assertEquals(63,intList.stream().reduce((i,n) -> i > n? i:n).get());
    }
}
