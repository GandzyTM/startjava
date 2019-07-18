/**
 * Максимальный из элементов массива с четными индексами
 */

package com.startjava.lesson_4.array;

import java.util.Random;

public class MaxElementArray {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[random.nextInt(13)];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        for (int printNumber : numbers) {
            System.out.println(printNumber);
        }

        int m = 0;
        for (int i = 0; i < numbers.length; i += 2) {
            if (numbers[i] > numbers[m]) {
                m = i;
            }
        }
        System.out.println(m + " - " + numbers[m]);

    }
}
