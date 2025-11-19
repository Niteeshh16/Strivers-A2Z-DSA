package patterns;

public class PatternDemoPract {
    static void pattern1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    
    static void pattern2(int n){
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for (int i = n; i >= 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");

            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern1(5);
        System.out.println("pattern2");
        pattern2(5);
        System.out.println("pattern3");
        pattern3(5);
        System.out.println("pattern4");
        

    }
}
