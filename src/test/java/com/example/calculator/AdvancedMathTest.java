
package com.example.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AdvancedMathTest {
    private final AdvancedMath advancedMath = new AdvancedMath();

    @Test
    void testFactorial() {
        assertEquals(120, advancedMath.factorial(5));
        assertEquals(1, advancedMath.factorial(0));
        assertThrows(IllegalArgumentException.class, () -> advancedMath.factorial(-1));
    }

    @Test
    void testIsPrime() {
        assertTrue(advancedMath.isPrime(2));
        assertTrue(advancedMath.isPrime(17));
        assertFalse(advancedMath.isPrime(1));
        assertFalse(advancedMath.isPrime(15));
    }

    @Test
    void testFibonacci() {
        assertEquals(0, advancedMath.fibonacci(0));
        assertEquals(5, advancedMath.fibonacci(5));
        assertEquals(55, advancedMath.fibonacci(10));
        assertThrows(IllegalArgumentException.class, () -> advancedMath.fibonacci(-1));
    }
}