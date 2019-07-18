/*
  Сумма четных положительных элементов массива
*/
package com.startjava.lesson_4.array.exercises;

import java.util.Arrays;
import java.util.Random;

public class SumChetPolElemArray {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[random.nextInt(10)];
        System.out.println("Entered " + numbers.length + " numbers");
        Arrays.setAll(numbers, i -> random.nextInt(100));

        int sum = 0;
        for (int number : numbers) {
            if (number > 0 && number % 2 == 0) sum += number;
        }
        System.out.println("Sum = " + sum);

    }
}
