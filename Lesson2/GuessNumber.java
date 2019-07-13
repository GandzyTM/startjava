import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Random random = new Random();
    private int computerNum = random.nextInt(101);
    private boolean win = false;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void playGame() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print(player1.getName() + " please enter your number: ");
            player1.setNumber(scan.nextInt());
            if (checkNum(player1.getNumber(), player1.getName()) == false) {
                break;
            }
            System.out.print(player2.getName() + " please enter your number: ");
            player2.setNumber(scan.nextInt());
            if (checkNum(player2.getNumber(), player2.getName()) == false) {
                break;
            }
        } // end while
    } // end void playGame

    private boolean checkNum(int userNum, String player) {
        if (userNum < 0 || userNum > 100) {
            System.out.println(player + " you entered number < 0 or > 100");
        }

        if (userNum >= 0 && userNum <= 100) {
            if (computerNum > userNum) {
                System.out.println(player + " you entered number LESS than the hidden number. Next player ");
            } else if (computerNum < userNum) {
                System.out.println(player + " you entered number GREATER than the hidden number. Next player ");
            } else if (computerNum == userNum) {
                System.out.println(player + " WINs! You are right!!! it is a " + computerNum);
                return false;
            }
        }
        return true;
    } // end checkNum
}
