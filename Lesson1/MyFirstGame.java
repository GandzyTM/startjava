public class MyFirstGame {
    public static void main(String[] args) {
        System.out.println("Enter a number between 0 and 100: ");
        int computerNum = 97;
        int userNum = 102;

        while (computerNum != userNum) {
            if (userNum < 0 || userNum >100) {
                System.out.println("You entered number < 0 or > 100");
                if (userNum < 0) {
                        userNum++;
                } else if (userNum > 100) {
                        userNum--;
                }
            }
            if (userNum >= 0 && userNum <= 100) {
                if (computerNum > userNum) {
                    System.out.println("Entered number LESS than the hidden number. Re enter please: ");
                        userNum++;
                } else if (computerNum < userNum) {
                    System.out.println("Entered number GREATER than the hidden number. Re enter please: ");
                        userNum--;
                }
            }
        }
        System.out.println("You are damn right!!! The hidden Number is: " + userNum);
    }
}
