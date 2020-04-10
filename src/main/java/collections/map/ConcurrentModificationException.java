package collections.map;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@Slf4j
public class ConcurrentModificationException {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        final Set<String> strings = map.keySet();
        for (String next : strings) {
            log.info("map.get(next) = {}  ", map.get(next));
            if (next.equalsIgnoreCase("two")) {
                map.remove("two");
            }

        }
    }
}
