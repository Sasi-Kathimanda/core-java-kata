package codebat.functional2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NoNegTest {

    public static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(Arrays.asList(1, -2), List.of(1)),
                Arguments.of(Arrays.asList(-3, -3, 3, 3), Arrays.asList(3, 3)),
                Arguments.of(Arrays.asList(-1, -1, -1), List.of())
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    void noNeg(List<Integer> input, List<Integer> expectedOutput) {
        //when
        List<Integer> result = NoNeg.noNeg(input);
        //then
        assertEquals(expectedOutput.size(), result.size());
        assertEquals(expectedOutput, result);
    }
}