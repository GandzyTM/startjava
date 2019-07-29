package com.startjava.lesson_4.game;

import java.util.Random;
import java.util.Scanner;

class GuessNumber {
    private int computerNum = new Random().nextInt(101);
    private Scanner scan = new Scanner(System.in);
    private Player player1;
    private Player player2;

    GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    void playGame() {
        while (true) {
            if (makeMove(player1)) {
                break;
            }
            if (makeMove(player2)) {
                break;
            }
        }
    }

    private boolean makeMove(Player player) {
        inputNumber(player);
        return compareNumbers(player);
    }

    private void inputNumber(Player player) {
        do {
            System.out.print(player.getName() + " please enter your number: ");
        } while (!player.setNumber(scan.nextInt()));
    }

    private boolean compareNumbers(Player player) {
        if (computerNum > player.getNumber()) {
            System.out.println(player.getName() + " вы ввели число МЕНЬШЕ загаданного. Следующий игрок.");
            // add number to numberArray of player
            player.setEnteredNumbers(player.getNumber());
        } else if (computerNum < player.getNumber()) {
            System.out.println(player.getName() + " вы ввели число БОЛЬШЕ загаданного. Следующий игрок.");
            // add number to numberArray of player
            player.setEnteredNumbers(player.getNumber());
        } else if (computerNum == player.getNumber()) {
            player.setEnteredNumbers(player.getNumber());
            System.out.println(player.getName() + "Игрок " + player.getName()
                    + " угадал число " + computerNum
                    + " с " + player.getTries() + " попытки.");
            // return number of choice and entered numbers
            return true;
        }
        return false;
    }
}
