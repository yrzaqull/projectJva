package com.example.dok;

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("год:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + "  високосный .");
        } else {
            System.out.println(year + " не  високосный.");
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
