package com.startjava.lesson_4.array.exercises;

import java.util.Arrays;
import java.util.Random;

public class ElementArrayMinAvg {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[random.nextInt(13)];

        Arrays.setAll(numbers, i -> random.nextInt(100));

        int sum = 0;
        for (int i : numbers) sum += i;
        int avg = sum / numbers.length;

        for (int number : numbers) {
            if (number < avg) {
                System.out.println("Number < avg: " + number);
            }
        }
    }
}
