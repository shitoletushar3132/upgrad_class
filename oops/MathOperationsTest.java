package oops;

class MathOperations {
    public double squareRoot(double number) {
        return Math.sqrt(number);
    }

    public double cubeRoot(double number) {
        return Math.cbrt(number);
    }

    public int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Factorial method for long
    public long factorial(long n) {
        long fact = 1L;
        for (long i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

public class MathOperationsTest {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        System.out.println("Square root of 25: " + math.squareRoot(25));
        System.out.println("Cube root of 27: " + math.cubeRoot(27));

        System.out.println("Factorial of 5 (int): " + math.factorial(5));
        System.out.println("Factorial of 20 (long): " + math.factorial(20L));
    }
}
