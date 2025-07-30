import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Cal {

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static HashMap<Integer, Integer> factor(int n) {
        ArrayList<Integer> factor = new ArrayList<>();
        HashMap<Integer, Integer> count = new HashMap<>();

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                if (count.containsKey(i)) {
                    count.put(i, count.get(i) + 1);
                } else {
                    count.put(i, 1);
                }
                // factor.add(i);
                n = n / i;
            }
        }
        return count;
    }

    // public static List<Integer> rotateLeft(int d, List<Integer> arr) {
    //     // Write your code here

      

    // }

    public static void main(String[] args) {
        // 45 = 3*15
        // 15 = 3 * 5;

        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        // rotateLeft(3, arr);

        System.out.println(arr);

        // int n1 = 36;
        // int n2 = 64;

        // HashMap<Integer,Integer> first = factor(n1);
        // HashMap<Integer,Integer> second = factor(n2);

        // System.out.println(first);
        // System.out.println(second);

        // Set<Integer> firstkey = first.keySet();
        // Set<Integer> key = first.keySet();
        // for(int i = 0; i<firstkey.)

    }
}
