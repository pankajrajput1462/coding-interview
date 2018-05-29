package java8inAction;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by psi143 on 2/21/2017.
 */
@FunctionalInterface
public interface BufferedReaderProcessor {
    String process(BufferedReader reader) throws IOException;
}
