package com.junit5.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class OptionalTest {
    @Test
    @DisplayName("whenCreateEmptyOptionalThenCorrect")
    void whenCreateEmptyOptionalThenCorrect() {
        Optional<String> opt = Optional.empty();
        assertFalse(opt.isPresent());
    }

    @Test
    @DisplayName("givenNonNull_ThenCreatesNonNullable_Correct")
    void givenNonNullThenCreatesNonNullableCorrect() {
        Optional<String> opt = Optional.of("Sasi");
        assertTrue(opt.isPresent());
    }

    @Test
    @DisplayName("givenNull_WhenCreates_ThenError")
    void givenNullWhenCreatesThenError() {
        String name = null;
        assertThrows(NullPointerException.class, () -> Optional.of(name));
    }
    
    @Test
    @DisplayName("givenNull_WhenCreatesNullable_ThenNoException")
    void givenNullWhenCreatesNullableThenNoException() {
        String name = null;
        Optional<String> opt = Optional.ofNullable(name);
        assertFalse(opt.isPresent());
    }
}

