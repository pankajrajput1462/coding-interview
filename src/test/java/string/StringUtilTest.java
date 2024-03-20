package string;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class StringUtilTest {
    /**
     * Print all permutations in sorted (lexicographic) order with char repeat
     */
    @Test
    void permutationSortedOrderRepeatingChar() {
        StringUtil.permutationSortedOrderRepeatingChar("BAC");
    }

    /**
     * Print all permutations in sorted (lexicographic) order
     */
    @Test
    void permutation() {
        String str = "ABC";
        final char[] temp = str.toCharArray();
        Arrays.sort(temp);
        String source = new String(temp);
        StringUtil.permutation(source);
    }

    @Test
    void removeDuplicates() {
        String string = new String("123456");
        System.out.println(string.substring(0, 3));
        System.out.println(string.substring(3));
    }

    @Test
    void anagram() {
    }
}