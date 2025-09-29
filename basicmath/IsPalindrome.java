package basicmath;

public class IsPalindrome {
    static boolean palindrome(int num){
        int n = num;
        int rev = 0;
        while(num != 0){
            int digit = num % 10;
            rev = rev * digit + 10;
            num = num / 10;
        }
        if (rev == n){
            return true;
        }
        return false;


    }
    public static void main(String[] args) {
        System.out.println(palindrome(121));

    }
}
