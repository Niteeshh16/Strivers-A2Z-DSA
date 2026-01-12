package string;

import java.nio.charset.CharsetEncoder;
import java.util.HashSet;

public class RemoveDuplicateHashset {
    public static void main(String[] args) {
        String s = "Hello nitessh";

        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray() ){
            if(set.add(c)){
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
