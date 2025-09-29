package basicmath;

public class ReverseNumber {
    static int reverse(int num){
        int rev = 0;
        while (num != 0){
            int digit = num % 10;  // will take the last digits
            rev = rev * 10 + digit;   // 0 * 10 + 3 = 3
            num = num / 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        System.out.println(reverse(243));


    }
}
