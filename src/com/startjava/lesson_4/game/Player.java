package com.startjava.lesson_4.game;

public class Player {
    private String name;
    private int number;

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
}
