package com.example.dok;

public class FibonacciCalculator {
    public static long getFibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n должн быть +");
        }
        if (n == 1 || n == 2) {
            return 1;
        }

        long prev = 1, curr = 1;
        for (int i = 3; i <= n; i++) {
            long next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }

    public static void main(String[] args) {
        int n = 10;

        long result = getFibonacci(n);
        System.out.println(n + "-е число Фибоначчи: " + result);
    }
}
