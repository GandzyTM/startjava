import java.util.Random;

public class GuessNumber {
    Random random = new Random();
    private int computerNum = random.nextInt(100);;

    public void playGame(int userNum) {
        while(computerNum != userNum) {
            if (userNum < 0 || userNum > 100) {
                System.out.println("You entered number < 0 or > 100");
            }

            if (userNum >= 0 && userNum <= 100) {
                if (computerNum > userNum) {
                    System.out.println("Entered number LESS than the hidden number. Re enter please: ");
                } else if (computerNum < userNum) {
                    System.out.println("Entered number GREATER than the hidden number. Re enter please: ");
                }
            }
        } // end of main while
        System.out.println("You are right!!! it is a " + computerNum);
    } // end void playGame
}


