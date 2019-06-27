import java.util.Scanner;

class CalculatorTest {
    public static void main(String[] args) {
        int answer = 1;
        while (answer == 1) {
            Calculator calc = new Calculator();
            Scanner scan = new Scanner(System.in);

            System.out.print("Введите первое число: ");
            calc.setNum1(scan.nextInt());

            System.out.print("Введите знак математической операции: ");
            calc.setOperation(scan.next());

            System.out.print("Введите второе число: ");
            calc.setNum2(scan.nextInt());

            System.out.println(calc.getResult());

            System.out.print("Хотите продолжить? [да/нет]: ");
            String choice = scan.next();
            if (choice.equals("нет")) {
                answer = 0;
            } else {
                answer = 1;
            }
        }
    }
}
