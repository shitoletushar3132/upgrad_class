import java.util.Scanner;

public class SimpleCalculator {

    public static void show() {
        System.out.println("Menu:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter first number: ");
            int firstNumber = sc.nextInt();
            System.out.print("Enter second number: ");
            int secondNumber = sc.nextInt();

            show();

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 5)
                break;

            switch (choice) {
                case 1:
                    System.out.println("Result of addition: " + (firstNumber + secondNumber));
                    break;
                case 2:
                    System.out.println("Result of substraction: " + (firstNumber - secondNumber));
                    break;
                case 3:
                    System.out.println("Result of multiplication: " + (firstNumber * secondNumber));
                    break;
                case 4:
                    System.out.println("Result of division: " + (firstNumber / secondNumber));
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

            System.out.print("Do you want to perform another calcuation? (yes/no): ");
            String action = sc.next();

            if (action.equalsIgnoreCase("yes")) {
                continue;
            } else {
                break;
            }
        }

        System.out.println("Exiting Program...");

        sc.close();
    }

}
