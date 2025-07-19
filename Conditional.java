import java.util.Scanner;

public class Conditional {

    static void CheckNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("It is a positive number");
        } else if (num < 0) {
            System.out.println("It is a negtive number");
        } else {
            System.out.println("It is a zero");
        }
        sc.close();
    }

    static void Checklogin() {
        String uName = "tshitole";
        String password = "3132";
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a username: ");
        String iName = sc.next();
        System.out.print("Enter a password");
        String iPass = sc.next();

        if (uName.equals(iName) && password.equals(iPass)) {
            System.out.println("You are login successfull!!!");

        } else {
            System.out.println("Enter a right credentials");
        }

        sc.close();
    }

    static void ShippingCost() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Total Amount: ");
        int amount = sc.nextInt();

        if (amount >= 50) {
            if (amount >= 100) {
                System.out.println("Shipping is free so total amount : " + amount);
            } else {
                amount += 5;
                System.out.println("The Total Shipping cost is: " + amount);
            }
        } else {
            amount += 10;
            System.out.println("The Total Shipping cost is: " + amount);
        }

        sc.close();
    }

    static void SwitchUse() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("Action");
                break;
            case 2:
                System.out.println("Drama");
                break;
            case 3:
                System.out.println("Comedy");
                break;
            default:
                System.out.println("enter a valid number btw 1 to 3");
                break;
        }
        sc.close();
    }

    static void CheckDrivingLicen() {
        Scanner sc = new Scanner(System.in);
        boolean hasADrivingLicene = false;

        System.out.print("Enter a age: ");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.print("you have a diving licene (true/false): ");
        hasADrivingLicene = sc.nextBoolean();

        if (age >= 18 && hasADrivingLicene) {
            System.out.println("You can drive");
        } else if (age >= 18 && !hasADrivingLicene) {
            System.out.println("Please issue a driving licene");
        } else {
            System.out.println("You are not eligible to drive");
        }
        sc.close();
    }

    static void gradeSystem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you marks: ");
        int mark = sc.nextInt();

        switch (mark / 10) {
            case 10:
                System.out.println("You got a 'O' grade");
                break;
            case 9:
                System.out.println("You got a 'O' grade");
                break;
            case 8:
                System.out.println("You got a 'A+' grade");
                break;
            case 7:
                System.out.println("You got a 'A' grade");
                break;
            case 6:
                System.out.println("You got a 'B+' grade");
                break;
            case 5:
                System.out.println("You got a 'B' grade");
                break;
            case 4:
                System.out.println("You got a 'F' grade");
                break;
            case 3:
                System.out.println("You got a 'F' grade");
                break;
            case 2:
                System.out.println("You got a 'F' grade");
                break;
            case 1:
                System.out.println("You got a 'F' grade");
                break;
            default:
                System.out.println("enter a valid marks");
                break;
        }
    }

    public static void main(String[] args) {
        // CheckNumber();
        // ShippingCost();
        // SwitchUse();

        // CheckDrivingLicen();
        gradeSystem();
    }
}