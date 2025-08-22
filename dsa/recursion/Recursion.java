package dsa.recursion;

public class Recursion {
    static void print(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        print(n - 1);
    }

    static void evenNum(int n) {
        if (n == 0)
            return;
        if (n % 2 == 0) {
            System.out.println(n);
        }

        evenNum(n - 1);
    }

    static int factoial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factoial(n - 1);
    }

    static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    static int sum(int n){
        if(n==1){
            return 1;
        }

        return n + sum(n-1);
    }

    public static void main(String[] args) {
        System.out.println("Numbers print: ");
        print(10);
        System.out.println("Even Numbers");
        evenNum(10);

        System.out.println("Factorial");
        System.out.println(factoial(5));

        System.out.println("fibonacii");
        System.out.println(fib(4));

        System.out.println("Sum of N:");
        System.out.println(sum(10));

    }
}
