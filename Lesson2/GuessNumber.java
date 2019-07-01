import java.util.Scanner;

public class GuessNumber {
    private String name;
    private int userNum;
    private int computerNum;

    public GuessNumber(int userNum, int computerNum) {
        this.userNum = userNum;
        this.computerNum = computerNum;
    }

    public void playGame() {

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
        }

        Scanner scan = new Scanner(System.in);
        String choice;
        do {
            System.out.print("Хотите продолжить? [да/нет]: ");
            choice = scan.next();
        } while (!choice.equals("да") && !choice.equals("нет"));

//        String choice = "да";
//        while (choice.equals("да")) {
            // TO DO

//        } // end while
    } // end void playGame
}

