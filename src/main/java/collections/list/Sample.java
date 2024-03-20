package collections.list;

import java.util.ArrayList;
import java.util.List;

public class Sample {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(3);
        strings.add("444");
        strings.add("4334");
        strings.add("44114");
        strings.add("44488");
        strings.add("4448339");
        strings.add("4448339");
        strings.add("4448339");
        strings.add("4448339");
        strings.add("4448339");
        strings.add("4448339");
        strings.add("4448339");
        strings.add("4448339");
        strings.add("4448339");
        for (String string : strings) {
            System.out.println("string = " + string);
        }
    }
}
