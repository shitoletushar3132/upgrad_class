public class ReverseNum {
    public static void main(String[] args) {
        int num = 132;
        int res = 0;

        while(num != 0){
            res = res * 10;
            res = res+ (num %10 );;
            num = num / 10;
        }

        System.out.println(res);
    }
}
