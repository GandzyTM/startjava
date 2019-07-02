import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private String name;
    private int userNum;
    private int computerNum;

    public GuessNumber(int userNum) {
        this.userNum = userNum;
    }

    public void playGame() {

        Random random = new Random();
        computerNum = random.nextInt(100);
        while(computerNum != userNum) {
            if (userNum < 0 || userNum > 100) {
                System.out.println("You entered number < 0 or > 100");
                if (userNum < 0) {
                    ++userNum;
                } else if (userNum > 100) {
                    --userNum;
                }
            }

            if (userNum >= 0 && userNum <= 100) {
                if (computerNum > userNum) {
                    System.out.println("Entered number LESS than the hidden number. Re enter please: ");
                    ++userNum;
                } else if (computerNum < userNum) {
                    System.out.println("Entered number GREATER than the hidden number. Re enter please: ");
                    --userNum;
                }
            }
        } // end of main while
        System.out.println("You are right!!! it is a " + computerNum);
    } // end void playGame
}


