package string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringAlgoTest {

    @Test
    void findFirstNonRepeatingChar() {
        final String pankajKumarSingh = "PankajKumarSingh";
        Assertions.assertEquals('P', pankajKumarSingh.charAt(StringAlgo.findFirstNonRepeatingChar(pankajKumarSingh)));
        final String geeksforgeeks = "geeksforgeeks";
        Assertions.assertEquals('f', geeksforgeeks.charAt(StringAlgo.findFirstNonRepeatingChar(geeksforgeeks)));
    }
}