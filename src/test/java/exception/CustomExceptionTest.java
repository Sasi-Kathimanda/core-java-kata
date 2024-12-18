package exception;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CustomExceptionTest {
    @Test
    void givenExceptionThrownShouldDisplayInLog() {
        String expectedMessage = "Custom error message";
        CustomException exception = assertThrows(CustomException.class, () -> {
            throw new CustomException("Custom error message", new Exception("original Exception"));
        });
        assertEquals(expectedMessage, exception.getCause().getMessage());
    }
}
