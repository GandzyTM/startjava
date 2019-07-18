package com.startjava.lesson_4.array;

import java.util.Random;

public class ElementArrayMinAvg {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[random.nextInt(13)];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        int avg = sum / numbers.length;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < avg) {
                System.out.println("Number < avg: " + numbers[i]);
            }
        }
    }
}
