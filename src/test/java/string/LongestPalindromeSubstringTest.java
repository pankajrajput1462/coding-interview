package string;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class LongestPalindromeSubstringTest {

    @Test
    public void longestPalindrome() {
        LongestPalindromeSubstring palinSubstring = new LongestPalindromeSubstring();
        assertEquals("geeksskeeg", palinSubstring.longestPalindrome("forgeeksskeegfor"));
        assertEquals("fbanabf", palinSubstring.longestPalindrome("fbanabfor"));
    }

    @Test
    public void stringPoolTest() {
        final String name = "Pankaj";
        String nameString = new String("Pankaj");

        assertEquals(nameString, name);


        String constantString = "interned Baeldung";
        String newString = new String("interned Baeldung");

//        assertThat(constantString).isNotSameAs(newString);

        String internedString = newString.intern();

//        assertThat(constantString)
//                .isSameAs(internedString);

        String third = new String("Baeldung");
        String fourth = new String("Baeldung");
        assertFalse(third == fourth);

        String first = "Baeldung";
        String second = "Baeldung";
        assertTrue(first == second);
    }
}