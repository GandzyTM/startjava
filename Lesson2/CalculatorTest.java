import java.util.Scanner;

class CalculatorTest {
    public static void main(String[] args) {
        String choice = "да";
        while (choice.equals("да")) {
            Calculator calc = new Calculator();
            Scanner scan = new Scanner(System.in);

            System.out.print("Введите первое число: ");
            calc.setNum1(scan.nextInt());

            System.out.print("Введите знак математической операции: ");
            calc.setOperation(scan.next());

            System.out.print("Введите второе число: ");
            calc.setNum2(scan.nextInt());

            System.out.println(calc.calculate());

            choice = "";
            while (!choice.equals("да") && !choice.equals("нет")) {
                System.out.print("Хотите продолжить? [да/нет]: ");
                choice = scan.next();
            }
        }
    }
}
