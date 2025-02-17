package com.wipro.java.usecase;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CollectionsApp {
    public static void main(String[] args) {
        // Step 1: Create a TreeMap and insert some data
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(101, "Alice");
        treeMap.put(103, "Charlie");
        treeMap.put(102, "Bob");
        treeMap.put(105, "Eve");
        treeMap.put(104, "David");

        System.out.println("TreeMap (Sorted Order): " + treeMap);

        // Step 2: Fetch data from TreeMap and store in HashMap
        HashMap<Integer, String> hashMap = new HashMap<>(treeMap);

        System.out.println("HashMap (No Order Guaranteed): " + hashMap);
    }
}

