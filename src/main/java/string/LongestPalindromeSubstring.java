package string;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LongestPalindromeSubstring {

    public String longestPalindrome(String src) {
        int length = src.length();
        /**
         * table[i}[j] will be false if substring[i..j] is not palindrome else it will be true
         */
        boolean[][] table = new boolean[length][length];
        //all string of length 1 is palindrome
        int maxLength = 1;
        for (int i = 0; i < length; i++) {
            table[i][i] = true;
        }
        //check for length  2
        int start = 0;
        for (int i = 0; i < length - 1; i++) {
            if (src.charAt(i) == src.charAt(i + 1)) {
                table[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }
        //Check for length more than 2 and k is length of substring
        for (int k = 3; k <= length; ++k) {
            //fix the starting index
            for (int i = 0; i < length - k + 1; ++i) {
                // get the ending ending of substring from starting index i and length k
                int j = i + k - 1;

                if (table[i + 1][j - 1] && src.charAt(i) == src.charAt(j)) {
                    table[i][j] = true;
                    if (k > maxLength) {
                        start = i;
                        maxLength = k;
                    }
                }
            }
        }
        String palindrome = getPalindrome(src, start, start + maxLength - 1);
        printTableInMatrixFormat(table);
        log.info("Longest palindrome is {}", palindrome);
        return palindrome;
    }

    private void printTableInMatrixFormat(boolean[][] table) {
        int row = table.length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(" "+table[i][j]+" ");
            }
            System.out.println();
        }
    }

    private String getPalindrome(String src, int low, int high) {
        return src.substring(low, high + 1);
    }
}
