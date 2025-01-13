package com.example.dok;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите десятичное число:");
        int decimalNumber = scanner.nextInt();

        String binaryNumber = Integer.toBinaryString(decimalNumber);

        System.out.println("Двоичное  число" + decimalNumber + ": " + binaryNumber);
    }
}
