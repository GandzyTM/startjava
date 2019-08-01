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

    public void getEnteredNumbers() {
//        return Arrays.toString(Arrays.copyOf(enteredNumbers, choice));
        System.out.print("Введенные игроком числа: ");
        for (int i = 0; i < Arrays.copyOf(enteredNumbers, choice).length; i++) {
            System.out.print(enteredNumbers[i] + " ");
        }
        System.out.println("");
    }

    public void resetEnteredNumbers() {
        Arrays.fill(enteredNumbers, 0, choice, 0);
        choice = 0;
    }
}
