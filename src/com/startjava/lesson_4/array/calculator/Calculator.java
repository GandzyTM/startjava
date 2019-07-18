package com.startjava.lesson_4.array.calculator;

class Calculator {
    private int num1;
    private int num2;
    private String operation;

    void setNum1(int num1) {
        this.num1 = num1;
    }

    void setNum2(int num2) {
        this.num2 = num2;
    }

    void setOperation(String operation) {
        this.operation = operation;
    }

    int calculate() {
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
                return (int) Math.pow(num1, num2);
            default:
                System.out.println("Неверный знак математической операции");
        }
        return 0;
    }
}
