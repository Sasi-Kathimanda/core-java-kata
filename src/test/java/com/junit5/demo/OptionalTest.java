package com.junit5.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;
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

    @Test
    @DisplayName("givenNull_WhenOrElseUsed_ThenReturnDefault")
    void givenNullWhenOrElseUsedThenReturnDefault() {
        String name = null;
        String opt = Optional.ofNullable(name).orElse("default");
        assertEquals("default", opt);
    }

    @Test
    @DisplayName("givenNull_WhenOrElseGetUsed_ThenReturnDefault")
    void givenNullWhenOrElseGetUsedThenReturnDefault() {
        String name = null;
        String result = Optional.ofNullable(name).orElseGet(() -> "default");
        assertEquals("default", result);
    }

    @Test
    @DisplayName("givenNull_WhenOrElseThrowCalled_ThenExceptionReturned")
    void givenNullWhenOrElseThrowCalledThenExceptionReturned() {
        String name = null;
        Optional<String> opt = Optional.ofNullable(name);
        assertThrows(IllegalArgumentException.class , () -> opt.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    @DisplayName("givenNull_WhenOrElseThrowWithNoArgCalled_ThenNoSuchExceptionThrown")
    void givenNullWhenOrElseThrowWithNoArgCalledThenNoSuchExceptionThrown() {
        String name = null;
        Optional<String> opt = Optional.ofNullable(name);
        assertThrows(NoSuchElementException.class, opt::orElseThrow);
    }
    @Test
    @DisplayName("givenNull_WhenGetIsCalled_NoSuchExceptionThrown")
    void givenNullWhenGetIsCalledNoSuchExceptionThrown() {
        String name = null;
        Optional<String> opt = Optional.ofNullable(name);
        assertThrows(NoSuchElementException.class, opt::get);
    }
}

