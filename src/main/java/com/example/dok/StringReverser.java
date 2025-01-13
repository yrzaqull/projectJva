package com.example.dok;

public class StringReverser {
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        String original = "diass lowskill!";
        String reversed = reverseString(original);
        System.out.println("Правдивая строка: " + original);
        System.out.println("реверс строчка : " + reversed);
    }
}
