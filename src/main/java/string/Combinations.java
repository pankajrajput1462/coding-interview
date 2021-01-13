package string;

public class Combinations {

    private StringBuilder output = new StringBuilder();
    private final String inputString;

    public Combinations(final String str) {
        inputString = str;
    }

    public void combine() {
        combine(0);
    }

    private void combine(int start) {
        for (int i = start; i < inputString.length(); i++) {
            output.append(inputString.charAt(i));
            System.out.println(output);
            if (i < inputString.length()) {
                combine(i + 1);
            }
            output.setLength(output.length() - 1);
        }
    }

}
