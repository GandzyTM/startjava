import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        String choice = "да";
        while (choice.equals("да")) {
            Scanner scan = new Scanner(System.in);
            System.out.println("First player enter your name: ");
            Player player1 = new Player();
            System.out.println("Second player enter your name: ");
            Player player2 = new Player();
            System.out.println("Today play: " + player1.getName() + " " + player2.getName());
            
            System.out.println("Computer got a number. What number do you think?");

            GuessNumber playGame = new GuessNumber();
            playGame.playGame();
            
            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                choice = scan.next();
            } while (!choice.equals("да") && !choice.equals("нет"));
        } // end of while
    } // end of method main
}
