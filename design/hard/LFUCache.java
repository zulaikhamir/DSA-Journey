// LeetCode 460 - LFU Cache
// https://leetcode.com/problems/lfu-cache/
// Design a cache with get/put in O(1) that evicts the Least Frequently Used key on capacity
// overflow, breaking ties by Least Recently Used among equally-frequent keys.
// Note: LRU Cache (the simpler cousin) already exists at linked-list/hard/LRUCacheDesign.java.
// Approach: HashMap<key, value>, HashMap<key, freq>, and HashMap<freq, LinkedHashSet<key>>
// (LinkedHashSet preserves insertion order for LRU tie-breaking within a frequency bucket),
// plus a minFreq pointer to know which bucket to evict from.
// Time: O(1) for get/put, Space: O(capacity)

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class LFUCache {

    private final int capacity;
    private int minFreq;
    private final Map<Integer, Integer> keyToVal = new HashMap<>();
    private final Map<Integer, Integer> keyToFreq = new HashMap<>();
    private final Map<Integer, LinkedHashSet<Integer>> freqToKeys = new HashMap<>();

    public LFUCache(int capacity) {
        this.capacity = capacity;
    }

    public static void main(String[] args) {
        LFUCache cache = new LFUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1)); // 1, freq(1)=2, freq(2)=1
        cache.put(3, 3);                  // evicts key 2 (least frequently used)
        System.out.println(cache.get(2)); // -1, evicted
        System.out.println(cache.get(3)); // 3
    }

    public int get(int key) {
        if (!keyToVal.containsKey(key)) return -1;

        bumpFreq(key);
        return keyToVal.get(key);
    }

    public void put(int key, int value) {
        if (capacity <= 0) return;

        if (keyToVal.containsKey(key)) {
            keyToVal.put(key, value);
            bumpFreq(key);
            return;
        }

        if (keyToVal.size() >= capacity) {
            // evict the least recently used key within the lowest frequency bucket
            LinkedHashSet<Integer> minBucket = freqToKeys.get(minFreq);
            int evictKey = minBucket.iterator().next();
            minBucket.remove(evictKey);
            keyToVal.remove(evictKey);
            keyToFreq.remove(evictKey);
        }

        keyToVal.put(key, value);
        keyToFreq.put(key, 1);
        freqToKeys.computeIfAbsent(1, k -> new LinkedHashSet<>()).add(key);
        minFreq = 1;
    }

    private void bumpFreq(int key) {
        int freq = keyToFreq.get(key);
        freqToKeys.get(freq).remove(key);

        if (freqToKeys.get(freq).isEmpty() && freq == minFreq) {
            minFreq++; // that was the last key at the old minimum frequency
        }

        keyToFreq.put(key, freq + 1);
        freqToKeys.computeIfAbsent(freq + 1, k -> new LinkedHashSet<>()).add(key);
    }
}
