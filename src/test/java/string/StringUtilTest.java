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
        String str = "BCA";
        final char[] temp = str.toCharArray();
        Arrays.sort(temp);
        String source = new String(temp);
        StringUtil.permutation(source);
    }

    @Test
    void removeDuplicates() {
    }

    @Test
    void anagram() {
    }
}