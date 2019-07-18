/**
 * Сумма четных положительных элементов массива
*/
package com.startjava.lesson_4.array;

import java.util.Random;

public class SumChetPolElemArray {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[random.nextInt(10)];
        System.out.println("Entered " + numbers.length + " numbers");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0 && numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
        }
        System.out.println("Sum = " + sum);

    }
}
