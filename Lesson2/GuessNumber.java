import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int computerNum;

    public int getComputerNum() {
        Random random = new Random();
        computerNum = random.nextInt(100);
        return computerNum;
    }

    public void playGame() {
        Scanner scan = new Scanner(System.in);
        Player player1 = new Player("Player1");

        System.out.print("Введите число от 0 до 100: ");
        player1.setUserNum(scan.nextInt());

        System.out.println(player1.getPlayerName() + " ввел: " + player1.getUserNum());
        System.out.println(getComputerNum());
    }
}
