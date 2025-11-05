package string;

public class Palindrome {
    static void chechPalindrome(String s) {
        String rev ="";
        for (int i = s.length()-1; i >=0; i--){
            rev += s.charAt(i);
        }
        System.out.println(rev);
        if (s.equals(rev)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }

    public static void main(String[] args) {
        String s = "madam";
        chechPalindrome(s);
    }
}
