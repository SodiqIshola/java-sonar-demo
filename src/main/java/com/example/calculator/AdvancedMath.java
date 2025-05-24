
package com.example.calculator;

/**
 * Extended mathematical operations beyond basic arithmetic
 * (Demonstrates more complex functionality for SonarQube analysis)
 */
public class AdvancedMath {
    
    // /**
    //  * Calculates factorial of a number
    //  * @param n Non-negative integer
    //  * @return Factorial value
    //  * @throws IllegalArgumentException if input is negative
    //  */
    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be non-negative");
        }
        return (n == 0) ? 1 : n * factorial(n - 1);
    }

    // /**
    //  * Checks if a number is prime
    //  * @param number Integer to check
    //  * @return true if prime, false otherwise
    //  */
    public boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // /**
    //  * Calculates Fibonacci number at given position
    //  * @param n Position in Fibonacci sequence (0-based)
    //  * @return Fibonacci number
    //  */
    public int fibonacci(int n) {
        if (n < 0) throw new IllegalArgumentException("Input must be non-negative");
        if (n <= 1) return n;
        
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}