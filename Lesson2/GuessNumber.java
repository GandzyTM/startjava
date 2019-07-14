import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Random random = new Random();
    private int computerNum = random.nextInt(101);
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void playGame() {
        while (true) {
            if (checkNum(player1)) {
                break;
            }
            if (checkNum(player2)) {
                break;
            }
        } // end while
    } // end void playGame

    private void setNumber(Player player) {
        Scanner scan = new Scanner(System.in);
        System.out.print(player.getName() + " please enter your number: ");
        player.setNumber(scan.nextInt());
    }

    private boolean checkNum(Player player) {

        if (player.getNumber() < 0 || player.getNumber() > 100) {
            System.out.println(player.getName() + " you entered number < 0 or > 100");
        }

        if (player.getNumber() >= 0 && player.getNumber() <= 100) {
            if (computerNum > player.getNumber()) {
                System.out.println(player.getName() + " you entered number LESS than the hidden number. Next player ");
            } else if (computerNum < player.getNumber()) {
                System.out.println(player.getName() + " you entered number GREATER than the hidden number. Next player ");
            } else if (computerNum == player.getNumber()) {
                System.out.println(player.getName() + " WINs! You are right!!! it is a " + computerNum);
                return true;
            }
        }
        return false;
    } // end checkNum
}
