package com.startjava.lesson_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String choice = "да";
        while (choice.equals("да")) {
            System.out.print("First player enter your name: ");
            Player player1 = new Player(scan.next());

            System.out.print("Second player enter your name: ");
            Player player2 = new Player(scan.next());

            System.out.println("Today play: " + player1.getName() + " " + player2.getName());
            System.out.println("Computer got a number. What number do you think?");

            GuessNumber playGame = new GuessNumber(player1, player2);
            playGame.playGame();

            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                choice = scan.next();
            } while (!choice.equals("да") && !choice.equals("нет"));
        } // end of main while
    } // end of method main
}
