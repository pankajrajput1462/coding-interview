package string;

public class StringAlgo {
    static final int NO_OF_CHARS = 256;
    static char[] count = new char[NO_OF_CHARS];

    public static int findFirstNonRepeatingChar(String source) {
        getCharCountArray(source);
        int index = -1;
        int i;
        for (i = 0; i < source.length(); i++) {
            if (count[source.charAt(i)] == 1) {
                index = i;
                break;
            }
        }
        return index;
    }

    private static void getCharCountArray(String source) {
        for (int i = 0; i < source.length(); i++) {
            count[source.charAt(i)]++;
        }
    }
}
