package immutability;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

final public class CardDetails {

    private final int id;
    private final String name;
    private final String acccount;
    private final HashMap<String, String> hashMap;
    private final List<String> strings;

    public CardDetails(int id, String name, String acccount, Map<String, String> map, List<String> magicWords) {
        this.id = id;
        this.name = name;
        this.acccount = acccount;
        strings = magicWords;

        HashMap<String, String> tmap = new HashMap<>();
        for (String key : map.keySet()) {
            tmap.put(key, map.get(key));
        }
        this.hashMap = tmap;
    }

    public HashMap<String, String> getHashMap() {
        return hashMap;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAcccount_no() {
        return acccount;
    }

}
