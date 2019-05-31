public class Calculator {
    public static void main(String[] args) {
        int var1 = 3;
        int var2 = 5;
        char znak = '^';

        if (znak == '+') {
            System.out.println(var1 + var2);
        }
        if (znak == '-') {
            System.out.println(var1 - var2);
        }
        if (znak == '/') {
            System.out.println(var1 / var2);
        }
        if (znak == '*') {
            System.out.println(var1 * var2);
        }
        if (znak == '^') {
            int res = 1;
            for (int i = 1; i <= var2; i++) {
                res = res * var1;
                System.out.println(res);
            }
        }
        if (znak == '%') {
            System.out.println(a % b);
        }  else {
            System.out.println(znak + " error");
        }
    }
}
