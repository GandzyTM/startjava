package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int number;
    private int[] enteredNumbers = new int[10];
    private int choice;

    Player(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    public int getNumber() {
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

    void setChoice(int choice) {
        this.choice = choice;
    }

    String getTries() {
        return Arrays.toString(enteredNumbers);
    }

    void setEnteredNumbers(int number) {
//        enteredNumbers[choice] = number;
        int[] tempArray = new int[enteredNumbers.length];
        System.arraycopy(enteredNumbers, 0, tempArray, 0, enteredNumbers.length);
//        tempArray[index position]
        enteredNumbers = tempArray;
//        int newSizeOutputElemets = enteredNumbers.length + 1;
//        int[] tempArray = new int[newSizeOutputElemets];
//        for (int i = 0; i < enteredNumbers.length; i++) {
//            tempArray[i] = enteredNumbers[i];
//        }
//        tempArray[newSizeOutputElemets - 2] = number;
//        enteredNumbers = tempArray;
    }
}
