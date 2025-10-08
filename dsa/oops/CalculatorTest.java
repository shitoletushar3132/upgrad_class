package oops;

class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }
}

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Int Addition: " + calc.add(10, 5));
        System.out.println("Int Subtraction: " + calc.subtract(10, 5));
        System.out.println("Int Multiplication: " + calc.multiply(10, 5));

        // Testing double methods
        System.out.println("Double Addition: " + calc.add(10.5, 5.2));
        System.out.println("Double Subtraction: " + calc.subtract(10.5, 5.2));
        System.out.println("Double Multiplication: " + calc.multiply(10.5, 5.2));
    }
}
 
