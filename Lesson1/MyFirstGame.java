public class MyFirstGame {
    public static void main(String[] args) {
        System.out.println("Enter a number between 0 and 100: ");
        int computerNum = 47;
        int userNum = 55;

        if (userNum >= 0 || userNum <= 100) {
            if (computerNum > userNum) {
                System.out.println("Entered number LESS than the hidden number. Re enter please: ");
                while (computerNum > userNum) {
                    userNum++;
                }
            } else if (computerNum < userNum) {
                System.out.println("Entered number GREATER than the hidden number. Re enter please: ");
                while (computerNum < userNum) {
                    userNum--;
                }
            }
        } else {
            System.out.println("You entered num > 100 or < 0");
            return;
        }

        System.out.println("You are damn right!!! The hidden Number is: " + userNum);
    }
}
