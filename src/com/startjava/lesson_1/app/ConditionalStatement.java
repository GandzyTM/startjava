public class ConditionalStatement {
    public static void main(String[] args) {
        short age = 29;
        if (age > 20) {
            System.out.println("Your age is more then 20");
        }

        boolean isMale = true;
        if (isMale) {
            System.out.println("You are a man");
        }

        if (!isMale) {
            System.out.println("You are woman");
        }

        double width = 1.85;
        if (width < 1.80) {
            System.out.println("You are not very high");
        } else {
            System.out.println("You are more then 180 sm");
        }

        char name = 'G';
        if (name == 'I') {
            System.out.println("Your name begin at I");
        } else if (name == 'M') {
            System.out.println("Your name begin at M");
        } else {
            System.out.println("Your name is unknown ^-)");
        }
    }
}
