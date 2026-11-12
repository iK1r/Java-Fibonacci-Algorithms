package com.example.fibonacci;

public class FibonacciRecursive {

    public static long fibonacci(int n) {
        if (n < 0 || n > 92) {
            throw new IllegalArgumentException("n must be between 0 and 92");
        }

        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
