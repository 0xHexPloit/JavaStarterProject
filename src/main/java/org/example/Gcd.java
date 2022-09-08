package org.example;

public class Gcd {
    public static int compute(int a, int b) {
        if (a == 0) {
            return b;
        }

        if (b == 0) {
            return a;
        }

        if (a == b) {
            return a;
        }

        if (a > b) {
            return compute(b, a % b);
        } else {
            return compute(a, b % a);
        }
    }
}
