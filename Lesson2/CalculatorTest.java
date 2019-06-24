class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.setNum1(2);
        calc.setOperation('^');
        calc.setNum2(10);
        calc.getMathOperation();
    }
}
