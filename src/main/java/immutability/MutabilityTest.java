package immutability;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MutabilityTest {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();
        map.put("One", "uuuu");
        map.put("two", "iii");

        List<String> magicWords = new ArrayList<>();
        magicWords.add("pankaj");
        magicWords.add("saurav");
        CardDetails cardDetails = new CardDetails(88, "pankaj", "account", map, magicWords);
        final Map<String, String> hashMap = cardDetails.getHashMap();
        hashMap.put("India", "love");
        final Map<String, String> hashMap1 = cardDetails.getHashMap();
        System.out.println("hashMap1 = " + hashMap1);

    }
}
