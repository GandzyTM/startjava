package GuessNumber;

import java.util.Random;

public class GuessNumber {
    private int computerNum;

    public int getComputerNum() {
        Random random = new Random();
        computerNum = random.nextInt(100);
        return computerNum;
    }
}
