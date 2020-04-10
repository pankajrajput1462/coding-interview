package string;

import org.junit.Assert;
import org.junit.Test;

public class LongestPalindromeSubstringTest {

    @Test
    public void longestPalindrome() {
        LongestPalindromeSubstring palinSubstring = new LongestPalindromeSubstring();
        Assert.assertEquals("geeksskeeg", palinSubstring.longestPalindrome("forgeeksskeegfor"));
        Assert.assertEquals("fbanabf", palinSubstring.longestPalindrome("fbanabfor"));
    }
}