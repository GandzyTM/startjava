import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        String choice;
        do {
            Scanner scan = new Scanner(System.in);

            System.out.println("First player enter your name: ");
            Player player1 = new Player();
            System.out.println("Second player enter your name: ");
            Player player2 = new Player();
            System.out.println("Today play: " + player1.getName() + " " + player2.getName());

            System.out.println("Computer got a number. What number do you think?");

            boolean result = false;
            while (!result) {
                GuessNumber playGame = new GuessNumber();
                System.out.print(player1.getName() + " please enter your number: ");
                player1.setNumber();
                playGame.playGame(player1.getNumber());

                System.out.print(player2.getName() + " please enter your number: ");
                player2.setNumber();
                playGame.playGame(player2.getNumber());

            }

        System.out.print("Хотите продолжить? [да/нет]: ");
        choice = scan.next();
        } while (!choice.equals("да") && !choice.equals("нет"));
    } // end of method main
}

