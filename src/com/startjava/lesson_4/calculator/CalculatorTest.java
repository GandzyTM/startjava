package com.startjava.lesson_4.calculator;

import java.util.Scanner;

class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = "да";
        while (choice.equals("да")) {
            Calculator calc = new Calculator();

            System.out.print("Введите математическое выражение: ");
            calc.splitMathOperation(scanner.nextLine());

            System.out.println("Вывод: " + calc.calculate());

            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                choice = scanner.nextLine();
            } while (!choice.equals("да") && !choice.equals("нет"));
        }
    }
}
