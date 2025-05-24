package com.example;

import com.example.calculator.MathOperations;
import com.example.calculator.AdvancedMath;
import java.util.Scanner;

/**
 * Main application class demonstrating calculator functionality
 * (Shows integration of all components with user interaction)
 */
public class App {
    private static final Scanner scanner = new Scanner(System.in);
    private static final MathOperations basicCalc = new MathOperations();
    private static final AdvancedMath advancedCalc = new AdvancedMath();

    public static void main(String[] args) {
        System.out.println("=== Java SonarQube Demo ===");
        
        while (true) {
            printMenu();
            int choice = getIntInput("Enter your choice: ");
            
            switch (choice) {
                case 1 -> handleBasicOperations();
                case 2 -> handleAdvancedOperations();
                case 3 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n1. Basic Operations");
        System.out.println("2. Advanced Operations");
        System.out.println("3. Exit");
    }

    private static void handleBasicOperations() {
        System.out.println("\n--- Basic Calculator ---");
        int a = getIntInput("Enter first number: ");
        int b = getIntInput("Enter second number: ");
        
        System.out.printf("%d + %d = %d\n", a, b, basicCalc.add(a, b));
        System.out.printf("%d - %d = %d\n", a, b, basicCalc.subtract(a, b));
        
        try {
            System.out.printf("%d / %d = %.2f\n", a, b, basicCalc.divide(a, b));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void handleAdvancedOperations() {
        System.out.println("\n--- Advanced Calculator ---");
        int num = getIntInput("Enter a number: ");
        
        System.out.printf("Factorial of %d = %d\n", num, advancedCalc.factorial(num));
        System.out.printf("Is %d prime? %b\n", num, advancedCalc.isPrime(num));
        System.out.printf("Fibonacci(%d) = %d\n", num, advancedCalc.fibonacci(num));
    }

    private static int getIntInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter an integer.");
            }
        }
    }
}