package lambda.excutearoundpattern;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.Function;

public class LambdaExecuteAround {

    String processFile(final String filePath) {
        try (var br = new BufferedReader(new FileReader(filePath))) {
            return br.readLine();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return null;
    }

    String enhancedProcessFile(BufferedReaderProcessor brp, final String filePath) {
        try (var br = new BufferedReader(new FileReader(filePath))) {
            return brp.process(br);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return null;
    }

    String enhancedProcessFileUsingBuiltInFuncInterface(final Function<BufferedReader, String> fs, final String filePath) {
        try (var br = new BufferedReader(new FileReader(filePath))) {
            return fs.apply(br);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return null;
    }
}
