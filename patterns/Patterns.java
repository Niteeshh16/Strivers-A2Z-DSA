package patterns;

public class Patterns {

    static void pattern1(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }

    static void pattern2(int n){
        for (int i = n; i >=0; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int i = n; i >= 1; i--) {
            // print spaces
            for (int j = i; j >= 1; j--) {
                System.out.print(" ");
            }
            // print stars
            for (int k = 1; k <= 2 * (n - i) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
      //  pattern1(5);
       // pattern2(5);
        pattern3(5);
    }

}
