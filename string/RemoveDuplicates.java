package string;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "NIteesh";
        int[] freq = new int[256];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);


            if (freq[ch] ==0) {
                freq[ch] = 1;
                sb.append(ch);
            }
        }
        System.out.println("Original String is :" + s);
        System.out.println("After removing hte duplicates: " + sb.toString());
    }
}
