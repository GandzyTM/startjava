package com.startjava.lesson_2_3.calculator;

public class Calculator {
    private int num1;
    private int num2;
    private String operation;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int calculate() {
        switch (operation) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "/":
                return num1 / num2;
            case "*":
                return num1 * num2;
            case "%":
                return num1 % num2;
            case "^":
                int result = 1;
                for (int i = 1; i <= num2; i++) {
                    result *= num1;
                }
                return result;
            default:
                System.out.println("Неверный знак математической операции");
        }
        return 0;
    }
}
