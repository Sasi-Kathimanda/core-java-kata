package com.junit5.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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

    @ParameterizedTest
    @MethodSource("provideDifferentInputAndExpectedOutput")
    @DisplayName("givenResponses_FindAnyOKOrAnyKOUsingReduce")
    void givenResponsesFindAnyOKOrAnyKOUsingReduce(String expected , List<String> input) {
        var result = input.stream().reduce((i,n) -> i.equals("OK") ? i : n).orElseGet(()->"get");
        assertEquals(expected,result);
    }

    private static Stream<Arguments> provideDifferentInputAndExpectedOutput() {
        return Stream.of(
                Arguments.of(
                        "OK",List.of("OK","KO","KO"),
                        "KO", List.of("KO","KO","KO")
        ));
    }
}
