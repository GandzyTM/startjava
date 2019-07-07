import java.util.Random;

public class GuessNumber {
    Random random = new Random();
    private int computerNum = random.nextInt(100);
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void playGame(int userNum) {
        if (userNum < 0 || userNum > 100) {
            System.out.println("You entered number < 0 or > 100");
        }

        if (userNum >= 0 && userNum <= 100) {
            if (computerNum > userNum) {
                System.out.println("Entered number LESS than the hidden number. Next player ");
                setCount(1);
            } else if (computerNum < userNum) {
                System.out.println("Entered number GREATER than the hidden number. Next player ");
                setCount(1);
            } else if (computerNum == userNum) {
                System.out.println("You are right!!! it is a " + computerNum);
                setCount(0);
            }
        }
    } // end void playGame
}


