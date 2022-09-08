package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RationalTest {
    @Test
    @DisplayName("Test that the constructor throws an exception when the denominator is zero")
    void testConstructorDenominatorZero() {
        assertThrows(IllegalArgumentException.class, () -> new Rational(1, 0));
    }

    @Test
    @DisplayName("Test that the constructor does not throw an exception when the denominator is not zero")
    void testConstructorDenominatorNotZero() {
        assertDoesNotThrow(() -> new Rational(1, 1));
    }

    @Test
    @DisplayName("test that the add method returns the same denominator when the denominators are equal")
    void testAddSameDenominator() {
        Rational rational1 = new Rational(1, 2);
        Rational rational2 = new Rational(1, 2);
        Rational rational3 = rational1.add(rational2);
        assertEquals(2, rational3.getDenominator());
    }

    @Test
    @DisplayName("test that the add method returns the correct numerator when the denominators are equal")
    void testAddSameDenominatorNumerator() {
        Rational rational1 = new Rational(1, 2);
        Rational rational2 = new Rational(1, 2);
        Rational rational3 = rational1.add(rational2);
        assertEquals(2, rational3.getNumerator());
    }

    @Test
    @DisplayName("test that the add method returns the correct denominator when the denominators are not equal")
    void testAddDifferentDenominator() {
        Rational rational1 = new Rational(1, 2);
        Rational rational2 = new Rational(1, 3);
        Rational rational3 = rational1.add(rational2);
        assertEquals(6, rational3.getDenominator());
    }

    @Test
    @DisplayName("test that the add method returns the correct numerator when the denominators are not equal")
    void testAddDifferentDenominatorNumerator() {
        Rational rational1 = new Rational(1, 2);
        Rational rational2 = new Rational(1, 3);
        Rational rational3 = rational1.add(rational2);
        assertEquals(5, rational3.getNumerator());
    }

    @Test
    @DisplayName("test that simplify returns the same rational when the rational is already simplified")
    void testSimplifyAlreadySimplified() {
        Rational rational = new Rational(1, 2);
        Rational simplified = rational.simplify();
        assertEquals(rational, simplified);
    }

    @Test
    @DisplayName("test that simplify returns the correct rational when the rational is not already simplified")
    void testSimplifyNotAlreadySimplified() {
        Rational rational = new Rational(2, 4);
        Rational simplified = rational.simplify();
        assertEquals(new Rational(1, 2), simplified);
    }

    @Test
    @DisplayName("test that toInt throws an exception when the denominator is not 1")
    void testToIntDenominatorNotOne() {
        Rational rational = new Rational(1, 2);
        assertThrows(ArithmeticException.class, rational::toInt);
    }

    @Test
    @DisplayName("test that toInt returns the correct integer when the denominator is 1")
    void testToIntDenominatorOne() {
        Rational rational = new Rational(1, 1);
        assertEquals(1, rational.toInt());
    }
}