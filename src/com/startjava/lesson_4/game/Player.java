package com.startjava.lesson_4.game;

import java.util.Arrays;

class Player {
    private String name;
    private int number;
    private int[] enteredNumbers = new int[10];
    private int choice = 0;

    Player(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    int getNumber() {
        return number;
    }

    boolean setNumber(int number) {
        if (number < 0 || number > 100) {
            return false;
        } else {
            this.number = number;
            return true;
        }
    }

    void encreaseChoice() {
        choice++;
//        if (choice == 10) {
//            System.out.println("Ваши попытки исчерпаны");
//        }
    }

    int getChoice() {
        return choice;
    }

    String getEnteredNumbers() {
        return Arrays.toString(Arrays.copyOf(enteredNumbers, choice));
    }

    void resetEnteredNumbers() {
        Arrays.fill(enteredNumbers, 0, choice, 0);
        choice = 0;
    }

    void setEnteredNumbers(int number) {
        enteredNumbers[choice - 1] = number;
    }
}
