package abc;

import java.util.*;

public class LRUCache {
    private final int capacity;
    private final Map<Integer, Integer> map;
    private final LinkedHashSet<Integer> order;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.order = new LinkedHashSet<>();
    }

    public int get(int key) {
        if (!map.containsKey(key)) return -1;
        order.remove(key);
        order.add(key);
        return map.get(key);
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            order.remove(key);
        } else if (map.size() == capacity) {
            int lru = order.iterator().next();
            order.remove(lru);
            map.remove(lru);
        }
        map.put(key, value);
        order.add(key);
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2); 
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println("Get 1: " + cache.get(1)); 
        cache.put(3, 3); 
        System.out.println("Get 2: " + cache.get(2)); 
        cache.put(4, 4); 
        System.out.println("Get 1: " + cache.get(1)); 
        System.out.println("Get 3: " + cache.get(3)); 
        System.out.println("Get 4: " + cache.get(4)); 
    }
}

