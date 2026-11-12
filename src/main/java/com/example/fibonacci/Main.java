package com.example.fibonacci;

public class Main {

    public static void main(String[] args) {
        int n = 6;

        System.out.println("n = " + n);
        System.out.println("Iterative: " + FibonacciIterative.fibonacci(n));
        System.out.println("Recursive: " + FibonacciRecursive.fibonacci(n));
        System.out.println("Dynamic programming: " + FibonacciDynamicProgramming.fibonacci(n));

        // A few simple checks, without extra testing libraries.
        int[] inputs = {0, 1, 2, 6, 10, 20};
        long[] expected = {0, 1, 1, 8, 55, 6765};

        for (int i = 0; i < inputs.length; i++) {
            int value = inputs[i];
            if (FibonacciIterative.fibonacci(value) != expected[i]
                    || FibonacciRecursive.fibonacci(value) != expected[i]
                    || FibonacciDynamicProgramming.fibonacci(value) != expected[i]) {
                throw new AssertionError("Incorrect Fibonacci value for n = " + value);
            }
        }
        System.out.println("All checks passed!");
    }
}
