package com.wipro.java.designhashmap;

import java.util.Objects;

public class DesignHashMap <K, V> {
    private static class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private static final int INITIAL_CAPACITY = 16;
    private Entry<K, V>[] table;

    public DesignHashMap() {
        table = new Entry[INITIAL_CAPACITY];
    }

    private int hash(K key) {
        return Objects.hashCode(key) % table.length;
    }

    public void put(K key, V value) {
        int index = hash(key);
        Entry<K, V> newEntry = new Entry<>(key, value);
        
        if (table[index] == null) {
            table[index] = newEntry;
        } else {
            Entry<K, V> current = table[index];
            Entry<K, V> prev = null;
            while (current != null) {
                if (current.key.equals(key)) {
                    current.value = value; // Update existing value
                    return;
                }
                prev = current;
                current = current.next;
            }
            prev.next = newEntry; // Insert new entry at end
        }
    }

    public V get(K key) {
        int index = hash(key);
        Entry<K, V> current = table[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null; // Key not found
    }

    public void remove(K key) {
        int index = hash(key);
        Entry<K, V> current = table[index];
        Entry<K, V> prev = null;
        
        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    table[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    public static void main(String[] args) {
        DesignHashMap<String, Integer> map = new DesignHashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        System.out.println(map.get("one")); // Output: 1
        map.remove("one");
        System.out.println(map.get("one")); // Output: null
    }
}