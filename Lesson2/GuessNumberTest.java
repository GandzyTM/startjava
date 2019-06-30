import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {

        String choice = "да";
        while (choice.equals("да")) {


            Scanner scan = new Scanner(System.in);
//            Player player1 = new Player("Player1");
            GuessNumber computer = new GuessNumber();
            computer.playGame();
//            System.out.print("Введите число от 0 до 100: ");
//            player1.setUserNum(scan.nextInt());
//
//
//
//            System.out.println(player1.getPlayerName() + " entered: " + player1.getUserNum());
//            System.out.println(computer.getComputerNum());





            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                choice = scan.next();
            } while (!choice.equals("да") && !choice.equals("нет"));
        }
    }
}
