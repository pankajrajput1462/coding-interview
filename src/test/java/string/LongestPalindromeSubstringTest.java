package string;

import org.junit.Assert;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LongestPalindromeSubstringTest {

    @Test
    public void longestPalindrome() {
        LongestPalindromeSubstring palinSubstring = new LongestPalindromeSubstring();
        Assert.assertEquals("geeksskeeg", palinSubstring.longestPalindrome("forgeeksskeegfor"));
        Assert.assertEquals("fbanabf", palinSubstring.longestPalindrome("fbanabfor"));
    }

    @Test
    public void stringPoolTest() {
        final String name = "Pankaj";
        String nameString = new String("Pankaj");
        Assert.assertEquals(nameString, name);


        String constantString = "interned Baeldung";
        String newString = new String("interned Baeldung");

        assertThat(constantString).isNotSameAs(newString);

        String internedString = newString.intern();

        assertThat(constantString)
                .isSameAs(internedString);

        String third = new String("Baeldung");
        String fourth = new String("Baeldung");
        Assert.assertFalse(third == fourth);

        String first = "Baeldung";
        String second = "Baeldung";
        Assert.assertTrue(first == second);
    }
}