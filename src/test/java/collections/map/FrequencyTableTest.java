package collections.map;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FrequencyTableTest {

    private String line;

    @BeforeEach
    public void setUp() {
        line = "My Name is Pankaj Kumar Singh Singh";
    }

    @Test
    void frequencyByHashMap() {
        final Map<String, Integer> hashMap = FrequencyTable.frequencyByHashMap(line);
        assertEquals(hashMap.get("Singh"), Integer.valueOf(2));
    }

    @Test
    void frequencyByTreeMap() {
        final Map<String, Integer> treeMap = FrequencyTable.frequencyByTreeMap(line);
        assertEquals(treeMap.get("Singh"), Integer.valueOf(2));
    }
}