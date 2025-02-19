package com.wipro.java.hashmap;

import java.util.*;

public class StudentHashMap {
    public static void main(String[] args) {
        // HashMap to store roll numbers with a list of names (to allow duplicates)
        HashMap<Integer, List<String>> studentMap = new HashMap<>();

        // Adding students with duplicate roll numbers
        addStudent(studentMap, 101, "Alice");
        addStudent(studentMap, 102, "Bob");
        addStudent(studentMap, 103, "Charlie");
        addStudent(studentMap, 101, "David");  // Duplicate roll number
        addStudent(studentMap, 104, "Eve");
        addStudent(studentMap, 102, "Frank");  // Duplicate roll number
        addStudent(studentMap, 105, "Grace");
        addStudent(studentMap, 106, "Hannah");
        addStudent(studentMap, 107, "Ivy");
        addStudent(studentMap, 103, "Jack");  // Duplicate roll number

        // Display the HashMap
        System.out.println("Student Records:");
        for (Map.Entry<Integer, List<String>> entry : studentMap.entrySet()) {
            System.out.println("Roll Number: " + entry.getKey() + " -> Names: " + entry.getValue());
        }
    }

    // Method to add students to the HashMap
    private static void addStudent(HashMap<Integer, List<String>> map, int rollNumber, String name) {
        map.computeIfAbsent(rollNumber, k -> new ArrayList<>()).add(name);
    }
}

