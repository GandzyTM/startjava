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

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public boolean setNumber(int number) {
        if (number < 0 || number > 100) {
            return false;
        } else {
            this.number = number;
            return true;
        }
    }

    public void incChoice() {
        choice++;
    }

    public int getChoice() {
        return choice;
    }

    public void setEnteredNumbers(int number) {
        enteredNumbers[choice - 1] = number;
    }

    public int[] getEnteredNumbers() {
        return Arrays.copyOf(enteredNumbers, choice);
    }

    public void resetEnteredNumbers() {
        Arrays.fill(enteredNumbers, 0, choice, 0);
        choice = 0;
    }
}
