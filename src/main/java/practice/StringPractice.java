package practice;

import java.util.Scanner;

/**
 * Created by psi143 on 2/28/2017.
 */
public class StringPractice {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        String src = scanner.next();
        System.out.println(isPalindrome(src));

        System.out.println(isPalindrome(scanner.next()));
    }

    private static boolean isPalindrome(String palindromecheck) {

        StringBuffer buffer = new StringBuffer(palindromecheck);
        if (palindromecheck.equals(buffer.reverse().toString()))
            return true;
        return false;
    }
}
