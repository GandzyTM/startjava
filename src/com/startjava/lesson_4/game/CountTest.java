package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CountTest {
    public int[] playerNumber;
    private int[] numbers;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

//        int[] numbers = new int[random.nextInt(15)];
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = random.nextInt(150);
//        }
//        Arrays.sort(numbers);
//        System.out.println("Array: " + Arrays.toString(numbers));
//        int[] copyNumbers = Arrays.copyOf(numbers, 3);
//        System.out.println("Copy of numbers: " + Arrays.toString(copyNumbers));
//
//        System.out.println("Enter next number: ");
//        int newNum = scanner.nextInt();
//        int newSizeArray = numbers.length + 1;
//        int[] tempArray = new int[newSizeArray];
//        for (int i = 0; i < numbers.length; i++) {
//            tempArray[i] = numbers[i];
//        }
//        tempArray[newSizeArray - 1] = newNum;
//        numbers = tempArray;
//        for (int num : numbers) {
//            System.out.println(num);
//        }

//        String[] myArray = new String[10];
//// Set initial contents
//        myArray[0] = "Car";
//        myArray[1] = "Van";
//        myArray[2] = "Bike";
//        int numberOfItems = 3;
//// try to add new value to the end
//        String newItem = "SUV";
//        myArray[numberOfItems++] = newItem;
//        for (int i=0; i<numberOfItems; i++ ) {
//            System.out.println( myArray[i] );
//        }

        int[] numbers = new int[5];
        int count = 0;
        do {
            addElementToArray(numbers, scanner.nextInt());
            count++;
        } while (count < 10);

    }

    static int[] addElement(int[] elements, int newNumber) {
        elements = Arrays.copyOf(elements, elements.length + 1);
        elements[elements.length - 1] = newNumber;
        return elements;
    }

    
    
    private static void addElementToArray(int[] elements, int newNumber) {
        int newSizeOutputElemets = elements.length + 1;
        int[] tempArray = new int[newSizeOutputElemets];
        for (int i = 0; i < elements.length; i++) {
            tempArray[i] = elements[i];
        }
        tempArray[newSizeOutputElemets - 1] = newNumber;
        elements = tempArray;
        System.out.println(Arrays.toString(elements));
    }
}
