package com.example.dok;
import java.util.Scanner;
import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println(" минимальное  :");
        int min = scanner.nextInt();
        System.out.println(" максимальное  :");
        int max = scanner.nextInt();

        if (min > max) {
            System.out.println("анрил такое сделать йоу");
            return;
        }

        int randomNumber = random.nextInt(max - min + 1) + min;

        System.out.println("Случайное число в диапазоне от " + min + " до " + max + ": " + randomNumber);
    }
}
