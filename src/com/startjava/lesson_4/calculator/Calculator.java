package com.startjava.lesson_4.calculator;

class Calculator {
    private String[] mathExpression = new String[3];

    void setMathOperation(String expression) {
        mathExpression = expression.split(" ");
//        for (int i = 0; i < mathExpression.length; i++) {
//            System.out.println(mathExpression[i]);
//        }
    }

    int calculate() {
        switch (mathExpression[1]) {
            case "+":
                return Integer.parseInt(mathExpression[0]) + Integer.parseInt(mathExpression[2]);
            case "-":
                return Integer.parseInt(mathExpression[0]) - Integer.parseInt(mathExpression[2]);
            case "/":
                return Integer.parseInt(mathExpression[0]) / Integer.parseInt(mathExpression[2]);
            case "*":
                return Integer.parseInt(mathExpression[0]) * Integer.parseInt(mathExpression[2]);
            case "%":
                return Integer.parseInt(mathExpression[0]) % Integer.parseInt(mathExpression[2]);
            case "^":
                return (int) Math.pow(Integer.parseInt(mathExpression[0]), Integer.parseInt(mathExpression[2]));
            default:
                System.out.println("Неверный знак математической операции");
        }
        return 0;
    }
}
