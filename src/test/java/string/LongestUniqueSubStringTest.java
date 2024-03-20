package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static string.LongestUniqueSubString.getUniqueCharacterSubstring;
import static string.LongestUniqueSubString.getUniqueCharacterSubstringUsingMap;

class LongestUniqueSubStringTest {

    @Test
    void getUniqueCharacterSubstringTest() {

        assertEquals("PANK", getUniqueCharacterSubstring("PANKA"));
        assertEquals("BCDAEFGHIJK", getUniqueCharacterSubstring("ABCDAEFGHIJK"));
        assertEquals("", LongestUniqueSubString.getUniqueCharacterSubstring(""));
        assertEquals("A", LongestUniqueSubString.getUniqueCharacterSubstring("A"));
        assertEquals("ABCDEF", LongestUniqueSubString.getUniqueCharacterSubstring("AABCDEF"));
        assertEquals("ABCDEF", getUniqueCharacterSubstring("ABCDEFF"));
        assertEquals("NGISAWE", getUniqueCharacterSubstring("CODINGISAWESOME"));
        assertEquals("be coding", getUniqueCharacterSubstring("always be coding"));
    }

    @Test
    void getUniqueCharacterSubstringUsingMapTest() {
        assertEquals("BCDAEFGHIJK", getUniqueCharacterSubstringUsingMap("ABCDAEFGHIJK"));
        assertEquals("", getUniqueCharacterSubstringUsingMap(""));
        assertEquals("A", getUniqueCharacterSubstringUsingMap("A"));
        assertEquals("ABCDEF", getUniqueCharacterSubstringUsingMap("AABCDEF"));
        assertEquals("ABCDEF", getUniqueCharacterSubstringUsingMap("ABCDEFF"));
        assertEquals("NGISAWE", getUniqueCharacterSubstringUsingMap("CODINGISAWESOME"));
        assertEquals("be coding", getUniqueCharacterSubstringUsingMap("always be coding"));
    }
}