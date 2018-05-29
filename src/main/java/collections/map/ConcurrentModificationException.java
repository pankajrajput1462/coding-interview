package collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ConcurrentModificationException {

    public static void main(String[] args) {
        Map<String,Integer> map= new HashMap<>();
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        final Set<String> strings = map.keySet();
        final Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println("map.get(next) = " + map.get(next));
            if (next.equalsIgnoreCase("two")){
                map.remove("two");
            }

        }
    }
}
