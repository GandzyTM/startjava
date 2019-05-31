public class Calculator {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        char znak = '^';

        if (znak == '+') {
            System.out.println(a + b);
        }
        if (znak == '-') {
            System.out.println(a - b);
        }
        if (znak == '/') {
            System.out.println(a / b);
        }
        if (znak == '*') {
            System.out.println(a * b);
        }
        if (znak == '^') {
            int res = 1;
            for (int i = 1; i <=b ; i++) {
                res = res * a;
                System.out.println(res);
            }
        }
        if (znak == '%') {
            System.out.println(a % b);
        }
        else {
            System.out.println(znak + " error");
        }
    }
}
