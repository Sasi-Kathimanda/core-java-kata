package com.junit5.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ExampleTest {
    @Test
    @DisplayName("should demo a simple assertion")
    void shouldShowSimpleAssertion() {
        assertEquals(1, 1);
    }

    @Test
    @DisplayName("assert all demo")
    void assertAllDemo() {
        List<Integer> list = List.of(3, 5, 6, 7);
        assertAll(() -> assertEquals(3, list.get(0)),
                () -> assertEquals(5, list.get(1)),
                () -> assertEquals(6, list.get(2)),
                () -> assertEquals(7, list.get(3)));
    }

    @Test
    @DisplayName("should only run when the assumption is met")
    void shouldOnlyRunWhenTheAssumptionIsMet() {
//        Assumptions.assumeTrue(Fixture.apiVersion()> 10);
        assertEquals(1, 1);
    }

    @ParameterizedTest(name = "input = {0}")
    @DisplayName("check function with different inputs")
    @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7})
    void checkFunctionWithDifferentInputs(int inputs) {
        assertAll(() -> assertEquals(inputs * inputs, square(inputs)));
    }

    private int square(int inputs) {
        return inputs * inputs;
    }
}
