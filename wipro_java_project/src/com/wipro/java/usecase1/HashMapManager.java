package com.wipro.java.usecase1;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapManager {
    private HashMap<Integer, String> hashMap;

    public HashMapManager() {
        hashMap = new HashMap<>();
    }

    // Convert TreeMap to HashMap
    public void convertFromTreeMap(TreeMap<Integer, String> treeMap) {
        hashMap.putAll(treeMap);
    }

    // Retrieve HashMap
    public HashMap<Integer, String> getHashMap() {
        return hashMap;
    }

    // Display HashMap data
    public void displayHashMap() {
        System.out.println("\nHashMap (No Order Guaranteed):");
        for (var entry : hashMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
