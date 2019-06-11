public class MyFirstGame {
    public static void main(String[] args) {
        System.out.println("Enter a number between 0 and 100: ");
        int computerNum = 47;
        int userNum = 48;
        if (computerNum > userNum) {
            System.out.println("Entered number LESS than the hidden number. Re enter please: ");
        }
        if (computerNum < userNum) {
            System.out.println("Entered number GREATER than the hidden number. Re enter please: ");
        }
        if (computerNum == userNum){
            System.out.println("You are damn right!!!");
        }
    }
}
