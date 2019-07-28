package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int number;
    private int[] enteredNumbers = new int[1];
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

    String getChoice() {
        return Arrays.toString(enteredNumbers);
    }

    void setEnteredNumbers(int enteredNumber) {
        int newSizeOutputElemets = enteredNumbers.length + 1;
        if (newSizeOutputElemets > 2) {
            int[] tempArray = new int[newSizeOutputElemets];
            for (int i = 0; i < enteredNumbers.length; i++) {
                tempArray[i] = enteredNumbers[i];
                tempArray[newSizeOutputElemets - 1] = enteredNumber;
                enteredNumbers = tempArray;
            }
        } else if (newSizeOutputElemets == 2) {
            int[] tempArray = new int[enteredNumbers.length];
            tempArray[0] = enteredNumber;
            enteredNumbers = tempArray;
        }
    }
}
