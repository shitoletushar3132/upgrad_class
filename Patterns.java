public class Patterns {

    static void square(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void rightTriangle(int n) {
        for (int i = 0; i <= n*2; i++) {
            if ( i < n) {
                for (int j = 1; j<=n-i ; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j = 1; j<=i-n; j++) {
                    System.out.print("* ");
                }
            }


            if(i == n) continue;
            System.out.println();
        }
    }


    static void oppositeTriangle(int n){
      
        for(int row = 1; row<=n; row++){
            for(int sp=1; sp<=n-row; sp++ ){
                System.out.print(" ");
            }
            for(int st=1; st<=row; st++){
                System.out.print("*");
            }


            System.out.println();
        }
    }


    static void downOppositeTriangle(int n){
        for(int i=0; i<=n; i++){
            for(int sp=1; sp<=i; sp++){
                System.out.print(" ");
            }
            for(int st=1; st<=n-i;st++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // square(10);

        // rightTriangle(5);
        
        oppositeTriangle(5);

        // downOppositeTriangle(5);
    }

}
