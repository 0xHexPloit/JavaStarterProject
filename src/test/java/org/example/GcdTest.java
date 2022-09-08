package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GcdTest {
    @Test
    @DisplayName("Computing GCD of the same number should return the number itself")
    void computeGcdOfTheSameNumber() {
        assertEquals(5, Gcd.compute(5, 5));
    }

    @Test
    @DisplayName("Computing GCD of 0 and a number should return the number itself")
    void computeGcdOfZeroAndNumber() {
        assertEquals(5, Gcd.compute(0, 5));
        assertEquals(5, Gcd.compute(5, 0));
    }

    @Test
    @DisplayName("Computing GCD of two numbers should return the GCD")
    void computeGcdOfTwoNumbers() {
        assertEquals(12, Gcd.compute(12, 36));
        assertEquals(12, Gcd.compute(36, 12));
        assertEquals(13, Gcd.compute(13, 39));
        assertEquals(13, Gcd.compute(39, 13));
    }

    @Test
    @DisplayName("Computing GCD of two prime numbers should return 1")
    void computeGcdOfTwoPrimeNumbers() {
        assertEquals(1, Gcd.compute(13, 17));
        assertEquals(1, Gcd.compute(17, 13));
    }
}