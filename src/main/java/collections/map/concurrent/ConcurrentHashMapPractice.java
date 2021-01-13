package collections.map.concurrent;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapPractice {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("123", "Pankaj");
        concurrentHashMap.putIfAbsent("234", "Kumar");
        concurrentHashMap.computeIfAbsent("444", s -> {
            /*
            Do processing and store data here
             */
            return "data";
        });

    }
}
