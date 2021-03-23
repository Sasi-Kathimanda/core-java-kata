package com.junit5.demo.optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class OptionalStreamMethodTest {
    @Test
    @DisplayName("givenListOfOptionals_FilterOutNonNull_UsingFilter&Map")
    void givenListOfOptionalsFilterOutNonNullUsingFilterAndMap() {
        var optionalsList = List.of(Optional.empty(), Optional.of("Sasi"), Optional.of("Kiran"), Optional.of("Kathimanda"));
        var result = optionalsList.stream()
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());
        Assertions.assertEquals(3,result.size());
    }

    @Test
    @DisplayName("givenListOfOptionals_ThenFilterOutNonNullsUsingFlatMap")
    void givenListOfOptionalsThenFilterOutNonNullsUsingFlatMap() {
        var optionalList = List.of(Optional.empty(), Optional.of("Sasi"), Optional.of("Kiran"), Optional.of("Raja"));
        var result = optionalList.stream()
                .flatMap(o -> o.isPresent() ? Stream.of(o.get()): Stream.empty())
                .collect(Collectors.toList());
        Assertions.assertEquals(3,result.size());
    }

    @Test
    @DisplayName("givenListOfOptionals_ThenFilterOutNonNullsUsingFlatMapWithoutIfPresent")
    void givenListOfOptionalsThenFilterOutNonNullsUsingFlatMapWithoutIfPresent() {
        var optionalList = List.of(Optional.empty(), Optional.of("Sasi"), Optional.of("Kiran"), Optional.of("Raja"));
        var result = optionalList.stream()
                .flatMap(o -> o.map(Stream::of).orElseGet(Stream::empty))
                .collect(Collectors.toList());
        Assertions.assertEquals(3,result.size());
    }

    /**
     *  using java 9 optional stream method
     */

    @Test
    @DisplayName("givenListOfOptionals_FilterOutNonNull_UsingJava9StreamMethod")
    void givenListOfOptionalsFilterOutNonNullUsingJava9StreamMethod() {
        var optionalsList = List.of(Optional.empty(), Optional.of("Sasi"), Optional.of("Kiran"), Optional.of("Kathimanda"));
        var result = optionalsList.stream()
                .flatMap(Optional::stream)
                .collect(Collectors.toList());
        Assertions.assertEquals(3,result.size());
    }
}
