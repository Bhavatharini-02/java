package com.wipro.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MinMax {

    public static void main(String[] args) {
        // Define the list of numbers
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3, 10, 20, 5, 25, 30);

        // Sort the numbers
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        // Find the minimum and maximum numbers
        int min = numbers.stream().min(Integer::compare).get();
        int max = numbers.stream().max(Integer::compare).get();

        // Print
        System.out.println("Sorted Numbers: " + sortedNumbers);
        System.out.println("Minimum Value: " + min);
        System.out.println("Maximum Value: " + max);
    }
}