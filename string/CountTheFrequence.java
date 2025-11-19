package string;

public class CountTheFrequence {
    static void usingHashmap(String s){

    }
    static void usingLoops(String s){

        int[] freq = new int[256];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        for (int i = 0; i < freq.length; i++){
            if (freq[i] > 0){
                System.out.println((char)i + "=" + freq[i]);
            }
        }

    }
    public static void main(String[] args) {
        String s =  "hello world";
        usingLoops(s);

        }

}
