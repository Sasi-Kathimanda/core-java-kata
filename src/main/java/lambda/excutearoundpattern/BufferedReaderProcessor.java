package lambda.excutearoundpattern;

import java.io.BufferedReader;

@FunctionalInterface
public interface BufferedReaderProcessor {
    String process(BufferedReader bufferedReader);
}
