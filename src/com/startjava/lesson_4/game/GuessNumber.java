package com.startjava.lesson_4.game;

import java.util.Random;
import java.util.Scanner;

class GuessNumber {
    private int computerNum;
    private Scanner scan = new Scanner(System.in);
    private Player player1;
    private Player player2;

    GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void playGame() {
        initGame();
        while (true) {
            if (checkChoice(player1) || makeMove(player1)) {
                break;
            }
            if (checkChoice(player2) || makeMove(player2)) {
                break;
            }
        }
    }

    private void initGame() {
        computerNum = new Random().nextInt(101);
        player1.resetEnteredNumbers();
        player2.resetEnteredNumbers();
    }

    private boolean checkChoice(Player player) {
        if (player.getChoice() == 10) {
            System.out.println("У " + player.getName() + " закончились попытки");
            return true;
        }
        return false;
    }

    private boolean makeMove(Player player) {
        inputNumber(player);
        player.incChoice();
        player.setEnteredNumbers(player.getNumber());
        return compareNumbers(player);
    }

    private void inputNumber(Player player) {
        do {
            System.out.print(player.getName() + " введите число: ");
        } while (!player.setNumber(scan.nextInt()));
    }

    private boolean compareNumbers(Player player) {
        if (computerNum > player.getNumber()) {
            System.out.println(player.getName() + " вы ввели число МЕНЬШЕ загаданного. Следующий игрок.");
        } else if (computerNum < player.getNumber()) {
            System.out.println(player.getName() + " вы ввели число БОЛЬШЕ загаданного. Следующий игрок.");
        } else if (computerNum == player.getNumber()) {
            System.out.println("Игрок " + player.getName()
                    + " угадал число " + computerNum
                    + " с " + player.getChoice() + " попытки.");
            player.getEnteredNumbers();
//            System.out.print("Введенные игроком числа: " + player.getEnteredNumbers());
            return true;
        }
        return false;
    }
}
