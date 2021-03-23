package com.junit5.demo.optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

}
