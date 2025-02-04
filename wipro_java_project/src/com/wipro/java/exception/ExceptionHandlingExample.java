package com.wipro.java.exception;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        ExceptionHandlingExample example = new ExceptionHandlingExample();
        
        // Handling Checked Exception
        example.readFile();

        // Handling Unchecked Exception
        example.divideNumbers();
        
        System.out.println("Program execution completed.");
    }

    // Method demonstrating Checked Exception (FileNotFoundException)
    public void readFile() {
        try {
            File file = new File("non_existent_file.txt"); // File doesn't exist
            FileReader reader = new FileReader(file); // May throw FileNotFoundException
        } catch (FileNotFoundException e) {
            System.out.println("Checked Exception Caught: " + e);
        }
    }

    // Method demonstrating Unchecked Exception (ArithmeticException)
    public void divideNumbers() {
        try {
            int a = 10, b = 0;
            int result = a / b; // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception Caught: " + e);
        }
    }
}
