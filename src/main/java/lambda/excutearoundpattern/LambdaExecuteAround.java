package lambda.excutearoundpattern;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.Function;

public class LambdaExecuteAround {

    String processFile() {
        try (var br = new BufferedReader(new FileReader("src/main/resources/simpleFile.txt"))) {
            return br.readLine();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return null;
    }

    String enhancedProcessFile(BufferedReaderProcessor brp) {
        try (var br = new BufferedReader(new FileReader("src/main/resources/simpleFile.txt"))) {
            return brp.process(br);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return null;
    }

    public String enhancedProcessFileUsingBuiltInFuncInterface(Function<BufferedReader,String> fs) {
        try (var br = new BufferedReader(new FileReader("src/main/resources/simpleFile.txt"))) {
            return fs.apply(br);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return null;
    }
}
