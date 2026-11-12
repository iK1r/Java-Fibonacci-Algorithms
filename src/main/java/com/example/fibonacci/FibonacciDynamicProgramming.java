package com.example.fibonacci;

import java.util.Arrays;

public class FibonacciDynamicProgramming {

    public static long fibonacci(int n) {
        if (n < 0 || n > 92) {
            throw new IllegalArgumentException("n must be between 0 and 92");
        }

        long[] memo = new long[n + 1];
        Arrays.fill(memo, -1);

        return calculate(n, memo);
    }

    private static long calculate(int n, long[] memo) {
        if (n <= 1) {
            return n;
        }

        if (memo[n] != -1) {
            return memo[n];
        }

        memo[n] = calculate(n - 1, memo) + calculate(n - 2, memo);
        return memo[n];
    }
}
