public class Calculator {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 5;
        char value = '^';

        if (value == '+') {
            System.out.println(num1 + num2);
        } else if (value == '-') {
            System.out.println(num1 - num2);
        } else if (value == '/') {
            System.out.println(num1 / num2);
        } else if (value == '*') {
            System.out.println(num1 * num2);
        } else if (value == '^') {
            int result = 1;
            for (int i = 1; i <= num2; i++) {
                result *= num1;
            }
            System.out.println(result);
        } else if (value == '%') {
            System.out.println(num1 % num2);
        }  
        else {
            System.out.println(value + " error");
        }
    }
}
