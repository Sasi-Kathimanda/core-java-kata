package javaeleven.to.javaseventeen;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiLineTest {
    @Test
    void givenMultiLineStringJ17CouldProcessCorrectly() {
        MultiLine multiLine = new MultiLine();
        String oldString = "{\n" +
                " \"name\": \"Sasi K\",\n" +
                " \"age\": 18,\n" +
                "}\n";
        String multiLineString =
                 """
                 {
                  "name": "Sasi K",
                  "age": 18,
                 }
                 """;
        multiLine.fromMultiLineToNormalisedString(multiLineString);
        assertEquals(oldString, multiLineString);
    }
}