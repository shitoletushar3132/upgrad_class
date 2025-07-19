import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt(); // total days since due date

        int totalDays = a - 7; // days after grace period
        double fine = 0.0;

        if (totalDays <= 7) {
            fine = 0.0;
        } else if (totalDays <= 23) { // 8–30 days after due
            fine = totalDays * 1.0;
        } else { // more than 30 days
            fine = totalDays * 2.0;
        }

        System.out.printf("%.1f\n", fine);
    }
}
