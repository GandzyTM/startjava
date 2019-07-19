package com.startjava.lesson_4.array.calculator;

import java.util.Scanner;

class CalculatorTest {
    public static void main(String[] args) {
        String choice = "да";
        while (choice.equals("да")) {
            Calculator calc = new Calculator();

            System.out.print("Введите математическое выражение: ");
            calc.setArray();
            System.out.println("Вывод: " + calc.calculate(calc.getNum1(), calc.getOperation(), calc.getNum2()));

            Scanner scan = new Scanner(System.in);
            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                choice = scan.next();
            } while (!choice.equals("да") && !choice.equals("нет"));
        }
    }
}
