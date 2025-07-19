package arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a length of Arrr: ");
        int len = sc.nextInt();

        int [] arr = new int [len];

        for(int i=0; i<len; i++){
            System.out.print("Enter a number you want to add: ");
            int num = sc.nextInt();
            arr[i] = num;
        }


        for(int n : arr){
            System.out.print(n+" ");
        }
        sc.close();
    }
}