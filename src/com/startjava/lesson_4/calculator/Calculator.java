package com.startjava.lesson_4.calculator;

class Calculator {
    private int num1;
    private int num2;
    private String operation;

    int getNum1() {
        return num1;
    }

    int getNum2() {
        return num2;
    }

    String getOperation() {
        return operation;
    }

   public void setMathOperation(String mathExpression) {
        String[] expression = mathExpression.split(" ");
        num1 = Integer.parseInt(expression[0]);
        num2 = Integer.parseInt(expression[2]);
        operation = expression[1];
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
