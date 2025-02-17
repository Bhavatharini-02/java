package com.wipro.java.usecase1;


import java.util.TreeMap;

public class TreeMapManager {
    private TreeMap<Integer, String> treeMap;

    public TreeMapManager() {
        treeMap = new TreeMap<>();
    }

    // Populate the TreeMap with sample data
    public void populateTreeMap() {
        treeMap.put(101, "Alice");
        treeMap.put(103, "Charlie");
        treeMap.put(102, "Bob");
        treeMap.put(105, "Eve");
        treeMap.put(104, "David");
    }

    // Fetch the TreeMap
    public TreeMap<Integer, String> getTreeMap() {
        return treeMap;
    }

    // Display TreeMap data
    public void displayTreeMap() {
        System.out.println("TreeMap (Sorted Order):");
        for (var entry : treeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
