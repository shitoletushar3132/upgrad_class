import java.util.Scanner;

public class Loops {

    static void naturalNumber() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    static void factorial(int num) {

        int i = 2;
        int factorial = 1;

        while (i <= num) {
            factorial *= i;
            i++;
        }
        System.out.println(factorial);

    }

    static void multiplication(int num) {
        int i = 1;
        do {
            System.out.println(i * num);
            i++;
        } while (i <= 10);
    }

    static void multipleOfNumNot() {
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0)
                continue;
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    static void reverse(int num) {
        int revers = 0;
        while (num != 0) {
            int mod = num % 10;
            revers = revers * 10 + mod;
            num = num / 10;
        }
        System.out.println(revers);
    }

    static void reverseFor(int num) {

        int newNum = 0;
        for (int i = num; i != 0; i = i / 10) {
            newNum = newNum * 10 + i;
        }
        System.out.println(newNum);
    }

    static void leapYear(int year) {

        if (year % 4 == 0) {
            if (year % 400 != 0 && year % 100 == 0) {
                System.out.println("It is a not leap year");
            } else {
                System.out.println("It is a  leap year");

            }
        } else {
            System.out.println("It is a not leap year");

        }
    }

    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        return sb.toString();
    }

    static void fibonacci(int num) {
        int first = 0;
        int last = 1;
        System.out.print(first + " " + last + " ");
        for (int i = 2; i < num; i++) {
            int sum = first + last;
            System.out.print(sum + " ");
            first = last;
            last = sum;
        }
    }

    public static void main(String[] args) {

        // sc.nextLine();

        // factorial(6);
        // multiplication(5);
        // multipleOfNumNot();
        // reverse(521);
        // reverse(243);
        // leapYear(1900);
        // fibonacci(5);
    }
}