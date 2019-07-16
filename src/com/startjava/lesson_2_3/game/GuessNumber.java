package src.com.startjava.lesson_2_3.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int computerNum = new Random().nextInt(101);
    private Scanner scan = new Scanner(System.in);
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void playGame() {
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
        while (true) {
            System.out.print(player.getName() + " please enter your number: ");
            if (player.setNumber(scan.nextInt())) {
                break;
            }
        }
    }

    private boolean compareNumbers(Player player) {
        if (computerNum > player.getNumber()) {
            System.out.println(player.getName() + " you entered number LESS than the hidden number. Next player ");
        } else if (computerNum < player.getNumber()) {
            System.out.println(player.getName() + " you entered number GREATER than the hidden number. Next player ");
        } else if (computerNum == player.getNumber()) {
            System.out.println(player.getName() + " WINs! You are right!!! it is a " + computerNum);
            return true;
        }
        return false;
    }
}
