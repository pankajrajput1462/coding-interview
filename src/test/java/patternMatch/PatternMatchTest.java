package patternMatch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatternMatchTest {
    @Test
    public void patternSearchTest() {
        String txt = "AABAACAADAABAAABAA";
        String pat = "AABA";
        assertEquals(3, PatternMatch.patternSearch(txt, pat));
    }

}