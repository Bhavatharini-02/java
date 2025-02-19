package com.wipro.java.game;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;

public class Game {

    // Database connection details
    private static final String DB_URL = "jdbc:mysql://localhost:3306/game";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "Bhava@2002";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;
        int attempts = 0;
        int guess = 0;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();

        // Game loop
        while (guess != targetNumber) {
            System.out.print("Guess a number between 1 and 100: ");
            guess = scanner.nextInt();
            attempts++;
            
            if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Congratulations, " + playerName + "! You guessed the number in " + attempts + " attempts.");
                saveScoreToDatabase(playerName, attempts);
            }
        }

        scanner.close();
    }

    // Save the player's score to the database
    private static void saveScoreToDatabase(String playerName, int attempts) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String query = "INSERT INTO game_scores (player_name, attempts) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, playerName);
            statement.setInt(2, attempts);
            statement.executeUpdate();
            System.out.println("Your score has been saved to the database!");
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
