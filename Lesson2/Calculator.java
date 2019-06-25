import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private String operation;

    public void setNum1() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scan.nextInt();
        this.num1 = num1;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum2() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите второе число: ");
        int num2 = scan.nextInt();
        this.num2 = num2;
    }

    public int getNum2() {
        return num2;
    }

    public void setOperation() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите знак математической операции: ");
        String operation = scan.nextLine();
        this.operation = operation;
    }

    public String getOperation() {
        return operation;
    }

    public int getResult() {
        int mathOperation = 0;
        switch (getOperation()) {
            case "+":
                mathOperation = getNum1() + getNum2();
                break;
            case "-":
                mathOperation = getNum1() - getNum2();
                break;
            case "/":
                mathOperation = getNum1() / getNum2();
                break;
            case "*":
                mathOperation = getNum1() * getNum2();
                break;
            case "%":
                mathOperation = getNum1() % getNum2();
                break;
            case "^":
                mathOperation = 1;
                for (int i = 1; i <= getNum2(); i++) {
                    mathOperation *= getNum1();
                }
                break;
        }
        return mathOperation;
    }
}
