public class MyFirstGame {
    public static void main(String[] args) {
        System.out.println("Enter a number between 0 and 100: ");
        int computerNum = 47;
        int userNum = 34;
        if (userNum < 0) {
            System.out.println("You entered num < 0");
        }
        else if (userNum > 100) {
            System.out.println("You entered num > 100");
        }
        else {

            if (computerNum > userNum) {
                System.out.println("Entered number LESS than the hidden number. Re enter please: ");
            }
            else if (computerNum < userNum) {
                System.out.println("Entered number GREATER than the hidden number. Re enter please: ");
            }
            else if (computerNum == userNum){
                System.out.println("You are damn right!!!");
            }
        }
    }
}
