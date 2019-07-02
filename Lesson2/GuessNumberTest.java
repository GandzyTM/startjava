import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String choice;
        do {
            System.out.println("First player enter your name: ");
            Player player1 = new Player();
            System.out.println("Second player enter your name: ");
            Player player2 = new Player();
            System.out.println("Today play: " + player1.getName() + " " + player2.getName());

            System.out.println("Computer got a number. What number do you think?");

            System.out.print(player1.getName() + " please enter your number: ");
            player1.setNumber();
            GuessNumber playGame = new GuessNumber(player1.getNumber());
            playGame.playGame();
            System.out.print("Хотите продолжить? [да/нет]: ");
            choice = scan.next();
        } while (!choice.equals("да") && !choice.equals("нет"));
    } // end of method main
}
