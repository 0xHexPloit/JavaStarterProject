package org.example;

public class Main {
    public static void main(String[] args) {
        Rational r1 = new Rational(2, 2);
        Rational r2 = new Rational(4, 6);

        System.out.println("Rational without simplification: " + r1);
        System.out.println("Rational with simplification: " + r1.simplify());
    }
}