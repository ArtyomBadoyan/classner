package Calc;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.plus(5, 9);
        System.out.println(result);

        result = calculator.minus(10,7);
        System.out.println(result);

        double bajanarar = calculator.divide(8,2);
        System.out.println(bajanarar);

        long bazmapatik = calculator.multiple(9,3);
        System.out.println(bazmapatik);

    }
}
