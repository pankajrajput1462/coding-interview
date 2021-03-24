package onlineexam;

public class DistributeBalls {
    /*
    We are denoting color with lowercase char
     */
    static int MAX_CHAR = 26;

    public String distributingBalls(int people, int colors, String colorCodes) {
        /*
         * Count array to count how many times color occurred
         */
        final int[] a = new int[MAX_CHAR];
        for (int i = 0; i < colors; i++) {
            /*
            Increasing count of each time when color appears
             */
            a[colorCodes.charAt(i) - 'a']++;
        }
        for (int i = 0; i < MAX_CHAR; i++)
            /*
            To check if any colors appears K times, if it does we will print no
             */
            if (a[i] > people)
                return "NO";

        return "YES";
    }
}
