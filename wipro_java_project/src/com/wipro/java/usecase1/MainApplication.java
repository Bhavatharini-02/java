package com.wipro.java.usecase1;


public class MainApplication {
    public static void main(String[] args) {
        // Step 1: Create and populate TreeMap
        TreeMapManager treeMapManager = new TreeMapManager();
        treeMapManager.populateTreeMap();
        treeMapManager.displayTreeMap();

        // Step 2: Convert TreeMap data to HashMap
        HashMapManager hashMapManager = new HashMapManager();
        hashMapManager.convertFromTreeMap(treeMapManager.getTreeMap());
        hashMapManager.displayHashMap();
    }
}
