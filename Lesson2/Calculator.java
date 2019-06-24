public class Calculator {
    private int num1;
    private int num2;
    private char operation;

    public void setOperation(char operation) {
        this.operation = operation;
        System.out.println("Введите знак математической операции: " + operation);
    }

    public void setNum1(int num1) {
        this.num1 = num1;
        System.out.println("Введите первое число: " + num1);
    }

    public void setNum2(int num2) {
        this.num2 = num2;
        System.out.println("Введите второе число: " + num2);
    }

    public void getMathOperation() {
        int mathOperation = 0;
        switch (operation) {
            case '+':
                mathOperation = num1 + num2;
                break;
            case '-':
                mathOperation = num1 - num2;
                break;
            case '/':
                mathOperation = num1 / num2;
                break;
            case '*':
                mathOperation = num1 * num2;
                break;
            case '^':
                mathOperation = 1;
                for (int i = 1; i <= num2; i++) {
                    mathOperation *= num1;
                }
                break;
        }
        System.out.println(mathOperation);
    }
}