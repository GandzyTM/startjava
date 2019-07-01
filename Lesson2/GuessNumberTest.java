import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter name for First player: ");
        Player player1 = new Player(scan.next(), 0);

        System.out.print("Enter name for Second player: ");
        Player player2 = new Player(scan.next(), 0);

        System.out.println("Today play: " + player1.getPlayerName() + " " + player2.getPlayerName());

        Player computer = new Player("Computer", random.nextInt(100));
        System.out.println("Computer got a number. What number do you think?");

        System.out.println(player1.getPlayerName() + " please enter your number: ");
        player1.setUserNum(scan.nextInt());
        GuessNumber playGame = new GuessNumber(player1.getUserNum(), computer.getUserNum());
        playGame.playGame();
    }
}
