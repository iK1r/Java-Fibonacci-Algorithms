package com.example.fibonacci;

public class FibonacciIterative {

    public static long fibonacci(int n) {
        validate(n);

        if (n <= 1) {
            return n;
        }

        long previous = 0;
        long current = 1;

        for (int i = 2; i <= n; i++) {
            long next = previous + current;
            previous = current;
            current = next;
        }

        return current;
    }

    private static void validate(int n) {
        if (n < 0 || n > 92) {
            throw new IllegalArgumentException("n must be between 0 and 92");
        }
    }
}
