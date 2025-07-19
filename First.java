import java.util.Scanner;

public class First{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String names;
         int age;
        char grade;
         String fsubject;

        System.out.print("Enter a names: ");
        names = sc.nextLine();
        System.out.print("Enter a age: ");
        age = sc.nextInt();
        System.out.print("Enter a grade: ");
        grade = sc.next().charAt(0);
        sc.nextLine();
        System.out.print("Enter a fav subject: ");
        fsubject = sc.nextLine();

        System.out.println("name: "+names);
        System.out.println("age: "+age);
        System.out.println("grade: "+grade);
        System.out.println("fav subject: "+fsubject);





    }
}