public class ConditionalStatement {
    public static void main(String[] args) {
        short yourAge = 29;
        String yourSex = "Male";
        double yourWidth = 1.85;
        char yourNameI = 'G';
        char yourNameM = 'G';
        if (yourAge > 20) {
            System.out.println("Your age is more then 20");
        }
        if (yourSex == "Male") {
            System.out.println("You are a man");
        }
        if (yourSex == "Female") {
            System.out.println("You are woman");
        }
        if (yourWidth < 1.80) {
            System.out.println("You are not very high");
        }
        else {
            System.out.println("You are more then 180 sm");
        }
        if (yourNameI == 'I') {
            System.out.println("Your name begin at I");
        }
        else if (yourNameM == 'M') {
            System.out.println("Your name begin at M");
        }
        else {
            System.out.println("Your name is unknown ^-)");
        }


    }
}
