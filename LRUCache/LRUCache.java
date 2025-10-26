import java.util.Map;
import java.util.LinkedHashMap;

public class LRUCache {

    private final int capacity;
    private final Map<String, Object> map;
    // usar ConcurrentLinkedHashMap, concurrent enviroments


    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new LinkedHashMap<String, Object>(capacity, 0.75f, true);
    }

    public Object get(String key) {
        return map.getOrDefault(key, null);
    }

    public void put(String key, Object value) {
        if (map.size() >= capacity && !map.containsKey(key)) {
            String eldestKey = map.keySet().iterator().next();
            map.remove(eldestKey);
        }
        map.put(key, value);
    }
}