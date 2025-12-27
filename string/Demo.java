package string;

public class Demo {
    public static void main(String[] args) {
        String s= "Jello";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e'){
                count++;
            }
        }
        System.out.println(count);

    }
}
