package class_Calculator3;

public class CalculatorExample3 {
    static void main(String[] args) {
        double result1 = 10 * 10 * Calculator3.pi;
        int result2 = Calculator3.plus(10, 5);
        int result3 = Calculator3.minus(10, 5);
        int result4 = Calculator3.multiply(10, 5);
        int result5 = Calculator3.divide(10, 5);

        System.err.println("result1: " + result1);
        System.err.println("result2: " + result2);
        System.err.println("result3: " + result3);
        System.err.println("result4: " + result4);
        System.err.println("result5: " + result5);
    }
}
