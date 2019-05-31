public class Calculator {
    public static void main(String[] args) {
        int var1 = 3;
        int var2 = 5;
        char value = '^';

        if (value == '+') {
            System.out.println(var1 + var2);
        }
        if (value == '-') {
            System.out.println(var1 - var2);
        }
        if (value == '/') {
            System.out.println(var1 / var2);
        }
        if (value == '*') {
            System.out.println(var1 * var2);
        }
        if (value == '^') {
            int res = 1;
            for (int i = 1; i <= var2; i++) {
                res *= var1;
            }
            System.out.println(res);
        }
        if (value == '%') {
            System.out.println(var1 % var2);
        }  else {
            System.out.println(value + " error");
        }
    }
}
