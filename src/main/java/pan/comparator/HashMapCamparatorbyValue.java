package pan.comparator;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapCamparatorbyValue {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.put("A", 99.5);
        map.put("B", 67.4);
        map.put("C", 67.4);
        map.put("D", 67.3);

        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(stringDoubleEntry -> System.out.println(stringDoubleEntry));
        //for reverse
        map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).forEach(stringDoubleEntry -> System.out.println(stringDoubleEntry));

    }
}
