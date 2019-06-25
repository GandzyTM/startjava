class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.setNum1();
        calc.setOperation();
        calc.setNum2();
        System.out.println(calc.getResult());
    }
}

