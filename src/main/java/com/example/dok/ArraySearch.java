package com.example.dok;

public class ArraySearch {
    public static int searchInArray(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 30;

        int index = searchInArray(numbers, target);

        if (index != -1) {
            System.out.println("Число " + target + " найдено: " + index);
        } else {
            System.out.println("Число " + target + " не найдено.");
        }
    }
}

