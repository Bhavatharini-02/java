package com.wipro.java.fibonaccitreemap;


import java.util.Scanner;
import java.util.TreeMap;

public class FibonacciTreeMap {
    public static void main(String[] args) {
        // Create a TreeMap to store Fibonacci numbers with their positions
        TreeMap<Integer, Integer> fibonacciMap = new TreeMap<>();
        
        // Get the number of terms from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int numTerms = scanner.nextInt();
        scanner.close();

        // Variables to store previous two Fibonacci numbers
        int first = 0;
        int second = 1;
        
        // Store the first two numbers in the TreeMap
        fibonacciMap.put(1, first);
        fibonacciMap.put(2, second);

        // Generate and store Fibonacci numbers in TreeMap
        for (int i = 3; i <= numTerms; i++) {
            int next = first + second;
            fibonacciMap.put(i, next);
            first = second;
            second = next;
        }

        // Display the Fibonacci series from the TreeMap
        System.out.println("Fibonacci Series:");
        for (var entry : fibonacciMap.entrySet()) {
            System.out.println("Position " + entry.getKey() + ": " + entry.getValue());
        }
    }
}
