package java11tojava17;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiLineTest {
    @Test
    void givenMultiLineStringJ17CouldProcessCorrectly() {
        MultiLine multiLine = new MultiLine();
        String multilineString =
                 """
                 {
                  "name": "Sasi K",
                  "age": 18,
                 }""";
        multiLine.fromMultiLineToNormalisedString(multilineString);
        assertEquals("", multilineString);
    }
}