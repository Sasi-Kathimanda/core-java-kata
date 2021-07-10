package lambda.excutearoundpattern;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LambdaExecuteAroundTest {

    @Test
    @DisplayName("givenFileProcessShouldGetTheFirstLine")
    void givenFileProcessShouldGetTheFirstLine() {
        LambdaExecuteAround lambdaExecuteAround = new LambdaExecuteAround();
        assertEquals("This is Line One", lambdaExecuteAround.processFile());
    }

    @Test
    @DisplayName("givenBehaviourEnhancedProcessFileWouldGiveTheExpectedOutput")
    void givenBehaviourEnhancedProcessFileWouldGiveTheExpectedOutput() {
        LambdaExecuteAround lambdaExecuteAround = new LambdaExecuteAround();
        String actual = lambdaExecuteAround.enhancedProcessFile(this::getFirstTwoLines);
        assertEquals("This is Line OneThis is Line Two", actual);
    }

    @Test
    @DisplayName("givenBehaviourEnhancedProcessFileUsingBuiltInFuncInterfaceGivesTheExpectedOutput")
    void givenBehaviourEnhancedProcessFileUsingBuiltInFuncInterfaceGivesTheExpectedOutput() {
        LambdaExecuteAround lambdaExecuteAround = new LambdaExecuteAround();
        String actual = lambdaExecuteAround.enhancedProcessFileUsingBuiltInFuncInterface(this::getFirstTwoLines);
        assertEquals("This is Line OneThis is Line Two", actual);
    }

    private String getFirstTwoLines(BufferedReader br) {
        try {
            return br.readLine() + br.readLine();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return null;
    }
}