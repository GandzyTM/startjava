public class MyFirstGame {
    public static void main(String[] args) {
        System.out.println("Enter a number between 0 and 100: ");
        int computerNum = 47;
        int userNum = -5;

        if (userNum < 0) {
            System.out.println("You entered num < 0");
        } else if (userNum > 100) {
            System.out.println("You entered num > 100");
        }

        if (userNum >= 0 || userNum <= 100){
            while (userNum != computerNum) {
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
            }
        }

        if (computerNum == userNum) {
            System.out.println("You are damn right!!! The hidden Number is: " + userNum);
        }
    }
}
