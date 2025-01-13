package com.example.dok;
import java.util.Scanner;

public class DivisionWithExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("делимое:");
            int dividend = scanner.nextInt();
            System.out.println("делитель:");
            int divisor = scanner.nextInt();

            int result = dividend / divisor;
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Математик дофига");
        } finally {
            System.out.println("ББ");
        }
    }
}

