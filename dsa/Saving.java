import java.util.Scanner;

public class Saving {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a principal amount : ");
        int amount = sc.nextInt();
        System.out.print("Enter a Rate : ");
        int rate = sc.nextInt();
        int year = 3;

        double interest = (amount * rate * year) / 100;

        System.out.println(interest);

        System.out.println("Total Payable Amount is : " + interest + amount);

    }

}
