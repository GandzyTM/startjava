import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Random random = new Random();
    private int computerNum = random.nextInt(101);
    private boolean win = false;

    public void playGame(Player player1, Player player2) {
        Scanner scan = new Scanner(System.in);
        while (win == false) {
            if (win == false) {
                System.out.print(player1.getName() + " please enter your number: ");
                player1.setNumber(scan.nextInt());
                checkNum(player1.getNumber());
            }

            if (win == false) {
                System.out.print(player2.getName() + " please enter your number: ");
                player2.setNumber(scan.nextInt());
                checkNum(player2.getNumber());
            }
        }
    } // end void playGame

    private void checkNum(int userNum) {
        if (userNum < 0 || userNum > 100) {
            System.out.println("You entered number < 0 or > 100");
        }

        if (userNum >= 0 && userNum <= 100) {
            if (computerNum > userNum) {
                System.out.println("Entered number LESS than the hidden number. Next player ");
            } else if (computerNum < userNum) {
                System.out.println("Entered number GREATER than the hidden number. Next player ");
            } else if (computerNum == userNum) {
                System.out.println("You are right!!! it is a " + computerNum);
                win = true;
            }
        }
    } // end void checkNum
}
