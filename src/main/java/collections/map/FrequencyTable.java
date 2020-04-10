package collections.map;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

@Slf4j
public class FrequencyTable {

    public static Map<String, Integer> frequencyByHashMap(String line) {
        Map<String, Integer> integerHashMap = new HashMap<String, Integer>();

        if (Objects.isNull(line) && line.isEmpty()) {
            line = "if it is to be it is up to me to delegate";
        }
        String[] list = line.split(" ");

        // Initialize frequency table from command line
        for (String a : list) {
            Integer freq = integerHashMap.get(a);
            integerHashMap.put(a, (freq == null) ? 1 : freq + 1);
        }

        log.info(integerHashMap.size() + " distinct words:");
        log.info("{}", integerHashMap);
        return integerHashMap;
    }

    public static Map<String, Integer> frequencyByTreeMap(String line) {
        Map<String, Integer> treeMap = new TreeMap<>();

        if (Objects.isNull(line) && line.isEmpty()) {
            line = "if it is to be it is up to me to delegate";
        }
        String[] list = line.split(" ");

        // Initialize frequency table from command line
        for (String a : list) {
            Integer freq = treeMap.get(a);
            treeMap.put(a, (freq == null) ? 1 : freq + 1);
        }

        log.info(treeMap.size() + " distinct words:");
        log.info("{}", treeMap);
        return treeMap;
    }


}
