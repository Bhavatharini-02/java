package com.wipro.java.exception;

public class CheckedException {
    public static void main(String[] args) {
        try {
            Class.forName("com.unknown.NonExistentClass"); // Class does not exist
        } catch (ClassNotFoundException e) {
            System.out.println("Checked Exception Caught: " + e);
        }
        
        System.out.println("Program continues...");
    }
}