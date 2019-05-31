public class ConditionalStatement {
    public static void main(String[] args) {
        short Age = 29;
        if (Age > 20) {
            System.out.println("Your age is more then 20");
        }

        String Pol = "Male";
        if (Pol == "Male") {
            System.out.println("You are a man");
        }

        if (Pol == "Female") {
            System.out.println("You are woman");
        }

        double Width = 1.85;
        if (Width < 1.80) {
            System.out.println("You are not very high");
        } else {
            System.out.println("You are more then 180 sm");
        }

        char NameI = 'G';
        char NameM = 'G';
        if (NameI == 'I') {
            System.out.println("Your name begin at I");
        } else if (NameM == 'M') {
            System.out.println("Your name begin at M");
        } else {
            System.out.println("Your name is unknown ^-)");
        }
    }
}
