package com.startjava.lesson_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Первый игрок введите своё имя: ");
        Player player1 = new Player(scan.next());

        System.out.print("Второй игрок введите своё имя: ");
        Player player2 = new Player(scan.next());

        GuessNumber playGame = new GuessNumber(player1, player2);

        String choice = "да";
        while (choice.equals("да")) {

            System.out.println("Сегодня играют: " + player1.getName() + " " + player2.getName());
            System.out.println("ИИ загадал число. Как вы думаете какое?");

            playGame.playGame();

            playGame.resetGame();
            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                choice = scan.next();
            } while (!choice.equals("да") && !choice.equals("нет"));
        } // end of main while
    } // end of method main
}
