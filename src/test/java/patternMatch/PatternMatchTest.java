package patternMatch;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import string.PatternMatch;

import static org.junit.jupiter.api.Assertions.*;

class PatternMatchTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void patternSearch() {
        String txt = "AABAACAADAABAAABAA";
        String pat = "AABA";
        assertEquals(3, PatternMatch.patternSearch(txt, pat));
    }

    @Test
    public void strMatch() {
        String str = "baaabab";
        String pattern = "*****ba*****ab";

        assertTrue(PatternMatch.strMatch(str, "*****ba*****ab", str.length(),
                pattern.length()));
        assertTrue(PatternMatch.strMatch(str, "ba*****ab", str.length()-1,
                pattern.length()));
        assertTrue(PatternMatch.strMatch(str, "ba*ab", str.length(),
                pattern.length()));
        assertTrue(PatternMatch.strMatch(str,"a*ab" , str.length(),
                pattern.length()));
        assertTrue(PatternMatch.strMatch(str, "a*****ab", str.length(),
                pattern.length()));
        assertTrue(PatternMatch.strMatch(str, "ba*ab****", str.length(),
                pattern.length()));
        assertTrue(PatternMatch.strMatch(str, "****", str.length(),
                pattern.length()));
        assertTrue(PatternMatch.strMatch(str, "*", str.length(),
                pattern.length()));

        assertTrue(PatternMatch.strMatch(str, "aa?ab", str.length(),
                pattern.length()));

        assertTrue(PatternMatch.strMatch(str, "b*b", str.length(),
                pattern.length()));

        assertTrue(PatternMatch.strMatch(str, "a*a", str.length(),
                pattern.length()));

        assertTrue(PatternMatch.strMatch(str, "baaabab", str.length(),
                pattern.length()));

        assertTrue(PatternMatch.strMatch(str, "?baaabab", str.length(),
                pattern.length()));

    }
}