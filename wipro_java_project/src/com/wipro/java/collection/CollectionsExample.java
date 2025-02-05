package com.wipro.java.collection;

import java.util.*;

public class CollectionsExample
{
    public static void main(String[] args) {
        // Array Implementation
        int[] num = new int[5]; //allocate memory
        //initialize values
        num[0] = 15;
        num[1] = 25;
        num[2] = 35;
        num[3] = 45;
        num[4] = 55;
        //print items
        for (int i = 0; i < num.length; i++) {
            System.out.println("Element at index " + i + ": " + num[i]);
        }
        
        // List Implementation
        List<Integer> list1 = new ArrayList<>();
       //add items to list l1
        list1.add(0, 10);
        list1.add(1, 20);
        list1.add(2, 30);
        System.out.println(list1);
        
      //add items to list l2
        List<Integer> list2 = new ArrayList<>();
        list2.add(40);
        list2.add(50);
        list2.add(60);
        
        //adding items
        list1.addAll(1, list2);
        System.out.println(list1);
        
        list1.remove(1);
        System.out.println(list1);
        
        System.out.println(list1.get(3));
        
        list1.set(0, 100);
        System.out.println(list1);
        
        // LinkedList Implementation
        int size = 6;
        
        List<Integer> ll1 = new LinkedList<>();
      //iterating values
        for (int i = 1; i <= size; i++) {
            ll1.add(i * 5);
        }
        System.out.println(ll1);
        
        ll1.remove(2);
        System.out.println(ll1);
        
        //after removing print ll1
        for (int i = 0; i < ll1.size(); i++) {
            System.out.println(ll1.get(i) + " ");
        }
        
        // HashMap Implementation
        Map<Integer, String> carBrands = new HashMap<>();
      //adding key-value pairs to the map
        carBrands.put(1, "Tesla");
        carBrands.put(2, "Ferrari");
        carBrands.put(3, "Toyota");
        carBrands.put(4, "Honda");
        
        //print key 1 and 2
        System.out.println("Key 1: " + carBrands.get(1));
        System.out.println("Key 2: " + carBrands.get(2));
        
        //if key 3 exists
        if (carBrands.containsKey(3)) {
            System.out.println("Key 3 exists with value: " + carBrands.get(3));
        }
        
        //iterating over the map using for loop
        System.out.println("\nIterating through the map:");
        for (Map.Entry<Integer, String> entry : carBrands.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        //remove key value pair at index 2
        carBrands.remove(3);
        
        //removing key 2 and print rest of all
        System.out.println("\nMap after removal of key 2:");
        for (Map.Entry<Integer, String> entry : carBrands.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}