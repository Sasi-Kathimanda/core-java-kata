package com.junit5.demo.optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OptionalStreamMethodTest {
    @Test
    @DisplayName("givenListOfOptionals_FilterOutNonNull_UsingFilter&Map")
    void givenListOfOptionalsFilterOutNonNullUsingFilterAndMap() {
        var optionalsList = List.of(Optional.empty(), Optional.of("Sasi"), Optional.of("Kiran"), Optional.of("Kathimanda"));
        var result = optionalsList.stream()
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());
        assertEquals(3, result.size());
        assertEquals("[Sasi, Kiran, Kathimanda]", result.toString());
    }

    @Test
    @DisplayName("givenListOfOptionals_ThenFilterOutNonNullsUsingFlatMap")
    void givenListOfOptionalsThenFilterOutNonNullsUsingFlatMap() {
        var optionalList = List.of(Optional.empty(), Optional.of("Sasi"), Optional.of("Kiran"), Optional.of("Raja"));
        var result = optionalList.stream()
                .flatMap(o -> o.isPresent() ? Stream.of(o.get()) : Stream.empty())
                .collect(Collectors.toList());
        assertEquals(3, result.size());
        assertEquals("[Sasi, Kiran, Raja]", result.toString());
    }

    @Test
    @DisplayName("givenListOfOptionals_ThenFilterOutNonNullsUsingFlatMapWithoutIfPresent")
    void givenListOfOptionalsThenFilterOutNonNullsUsingFlatMapWithoutIfPresent() {
        var optionalList = List.of(Optional.empty(), Optional.of("Sasi"), Optional.of("Kiran"), Optional.of("Raja"));
        var result = optionalList.stream()
                .flatMap(o -> o.map(Stream::of).orElseGet(Stream::empty))
                .collect(Collectors.toList());
        assertEquals(3, result.size());
    }

    /**
     * using java 9 optional stream method.
     */

    @Test
    @DisplayName("givenListOfOptionals_FilterOutNonNull_UsingJava9StreamMethod")
    void givenListOfOptionalsFilterOutNonNullUsingJava9StreamMethod() {
        var optionalsList = List.of(Optional.empty(), Optional.of("Sasi"), Optional.of("Kiran"), Optional.of("Kathimanda"));
        var result = optionalsList.stream()
                .flatMap(Optional::stream)
                .collect(Collectors.toList());
        assertEquals(3, result.size());
    }

    @Test
    @DisplayName("shouldReturnOptional_WhenMapIsCalledOnOptionalOfString")
    void shouldReturnOptionalWhenMapIsCalledOnOptionalOfString() {
        Optional<String> name = Optional.of("Sasi");
        assertEquals(Optional.of("SASI"), name.map(String::toUpperCase));

        assertEquals(Optional.of(Optional.of("SASI")), name.map(s -> Optional.of(s.toUpperCase())));
        assertEquals(Optional.of("SASI"), name.flatMap(s -> Optional.of(s.toUpperCase())));

        var names = List.of(Optional.of("Sasi"), Optional.of("Kiran"));
        List<Optional<String>> result = names.stream()
                .map(it -> it.map(String::toUpperCase))
                .collect(Collectors.toList());
        assertEquals(List.of(Optional.of("SASI"), Optional.of("KIRAN")), result);
    }
}
