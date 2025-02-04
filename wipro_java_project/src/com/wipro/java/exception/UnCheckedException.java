package com.wipro.java.exception;
public class UnCheckedException {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3, 4, 5};
            System.out.println(numbers[10]); // Accessing invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Unchecked Exception Caught: " + e);
        }
        System.out.println("Program continues...");
    }
}