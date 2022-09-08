package org.example;

public class Rational {
    private final int numerator;
    private final int denominator;

    public Rational(int numerator, int denominator) throws IllegalArgumentException {
        // Checking that the denominator is not zero
        if (denominator == 0) {
            throw new IllegalArgumentException("The denominator cannot be zero.");
        }

        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Rational add(Rational other) {
        // Checking that other is not null
        if (other == null) {
            throw new IllegalArgumentException("The other rational cannot be null.");
        }

        // Checking that denominators are equal
        if( this.denominator == other.getDenominator()) {
            return new Rational(this.numerator + other.getNumerator(), this.denominator);
        }

        return new Rational(
            this.numerator * other.getDenominator() + other.getNumerator() * this.denominator,
            this.denominator * other.getDenominator()
        );
    }

    public Rational simplify() {
        int gcd = Gcd.compute(this.numerator, this.denominator);
        return new Rational(this.numerator / gcd, this.denominator / gcd);
    }

    public int toInt() throws ArithmeticException {
        // Checking that the denominator is 1
        if (this.denominator != 1) {
            throw new ArithmeticException("The denominator is not 1.");
        }

        return this.numerator;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Rational other)) {
            return false;
        }

        return this.numerator == other.getNumerator() && this.denominator == other.getDenominator();
    }

    @Override
    public String toString() {
        return String.format("Rational(%d/%d)", this.numerator, this.denominator);
    }
}
