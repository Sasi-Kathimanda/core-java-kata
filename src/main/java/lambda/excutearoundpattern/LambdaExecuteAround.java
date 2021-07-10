package lambda.excutearoundpattern;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LambdaExecuteAround {

    String processFile() {
        try (var br = new BufferedReader(new FileReader("src/main/resources/simpleFile.txt"))) {
            return br.readLine();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return "";
    }

    String enhancedProcessFile(BufferedReaderProcessor brp) {
        try (var br = new BufferedReader(new FileReader("src/main/resources/simpleFile.txt"))) {
            return brp.process(br);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return "";
    }
}
