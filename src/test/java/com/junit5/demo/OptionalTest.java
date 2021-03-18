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
        Optional<String> stringOptional = Optional.ofNullable(name);
        assertFalse(stringOptional.isPresent());
    }

    @Test
    @DisplayName("givenNull_WhenOrElseUsed_ThenReturnDefault")
    void givenNullWhenOrElseUsedThenReturnDefault() {
        String name = null;
        String result = Optional.ofNullable(name).orElse("default");
        assertEquals("default", result);
    }

    @Test
    @DisplayName("givenNull_WhenOrElseGetUsed_ThenReturnDefault")
    void givenNullWhenOrElseGetUsedThenReturnDefault() {
        String name = null;
        String result = Optional.ofNullable(name).orElseGet(() -> "default");
        assertEquals("default", result);
    }

    /**
     *  Exceptions with orElseThrow
     */
    @Test
    @DisplayName("givenNull_WhenOrElseThrowCalled_ThenExceptionReturned")
    void givenNullWhenOrElseThrowCalledThenExceptionReturned() {
        String name = null;
        Optional<String> stringOptional = Optional.ofNullable(name);
        assertThrows(IllegalArgumentException.class,
                () -> stringOptional.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    @DisplayName("givenNull_WhenOrElseThrowWithNoArgCalled_ThenNoSuchExceptionThrown")
    void givenNullWhenOrElseThrowWithNoArgCalledThenNoSuchExceptionThrown() {
        String name = null;
        Optional<String> stringOptional = Optional.ofNullable(name);
        assertThrows(NoSuchElementException.class, stringOptional::orElseThrow);
    }

    @Test
    @DisplayName("givenNull_WhenGetIsCalled_ThenNoSuchExceptionThrown")
    void givenNullWhenGetIsCalledThenNoSuchExceptionThrown() {
        String name = null;
        Optional<String> stringOptional = Optional.ofNullable(name);
        assertThrows(NoSuchElementException.class, stringOptional::get);
    }

    /**
     * Optional with Filter
     */
    static class Mobile {
        Double price;

        public Mobile(Double price) {
            this.price = price;
        }

        public Double getPrice() {
            return price;
        }
    }

    static boolean priceWithInRange(Mobile mobile) {
        if (mobile == null || mobile.getPrice() == null) {
            return false;
        }
        return mobile.getPrice() >= 300 && mobile.getPrice() <= 500;
    }

    static boolean priceWithRangeUsingOptional(Mobile mobile) {
        return Optional.ofNullable(mobile)
                .map(Mobile::getPrice)
                .filter(e -> e >= 300)
                .filter(e -> e <= 500)
                .isPresent();
    }

    @Test
    @DisplayName("givenDifferentPrices_ThenFindPriceRangesAreOk")
    void givenDifferentPricesThenFindPriceRangesAreOk() {
        assertAll(() -> assertFalse(priceWithInRange(new Mobile(1000.00))),
                () -> assertFalse(priceWithInRange(new Mobile(200.00))),
                () -> assertTrue(priceWithInRange(new Mobile(400.00))),
                () -> assertFalse(priceWithInRange(new Mobile(null))),
                () -> assertFalse(priceWithInRange(null))
        );
    }

    @Test
    @DisplayName("givenDifferentPrices_ThenFindPriceRangesAreOkUsingOptional")
    void givenDifferentPricesThenFindPriceRangesAreOkUsingOptional() {
        assertAll(() -> assertFalse(priceWithRangeUsingOptional(new Mobile(1000.00))),
                () -> assertFalse(priceWithRangeUsingOptional(new Mobile(200.00))),
                () -> assertTrue(priceWithRangeUsingOptional(new Mobile(400.00))),
                () -> assertFalse(priceWithRangeUsingOptional(new Mobile(null))),
                () -> assertFalse(priceWithRangeUsingOptional(null))
        );
    }

    @Test
    @DisplayName("givenOptional_WhenGetsCalled_ThenReturnsWrappedValue")
    void givenOptionalWhenGetsCalledThenReturnsWrappedValue() {
        Optional<String> optionalString = Optional.of("Sasi");
        assertEquals("Sasi",optionalString.get());
    }

    @Test
    @DisplayName("givenOptionalWithNull_WhenGetCalled_ThenReturnsNoSuchElementException")
    void givenOptionalWithNullWhenGetCalledThenReturnsNoSuchElementException() {
        Optional<String> optionalString = Optional.ofNullable(null);
        assertThrows(NoSuchElementException.class,()->optionalString.get());
    }

}

