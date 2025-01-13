package com.example.dok;

public class PalindromeChecker {
    public static boolean isPalindrome(String input) {
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reversed = new StringBuilder(normalized).reverse().toString();
        return normalized.equals(reversed);
    }

    public static void main(String[] args) {
        String testString = "А роза упала на лапу Азора";
        if (isPalindrome(testString)) {
            System.out.println("\"" + testString + "\"  палиндром.");
        } else {
            System.out.println("\"" + testString + "\" не  палиндром.");
        }
    }
}
