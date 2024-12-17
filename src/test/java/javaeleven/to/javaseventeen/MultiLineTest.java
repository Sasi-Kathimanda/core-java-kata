package javaeleven.to.javaseventeen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiLineTest {
    @Test
    void givenMultiLineStringJ17CouldProcessCorrectly() {
        MultiLine multiLine = new MultiLine();
        String OldString = "{\n" +
                " \"name\": \"Sasi K\",\n" +
                " \"age\": 18,\n" +
                "}\n";
        String multilineString =
                 """
                 {
                  "name": "Sasi K",
                  "age": 18,
                 }
                 """;
        multiLine.fromMultiLineToNormalisedString(multilineString);
        assertEquals(OldString, multilineString);
    }
}