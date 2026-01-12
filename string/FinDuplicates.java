package string;

import java.util.HashSet;

public class FinDuplicates {
    public static void main(String[] args) {
        String s ="Programming";
        HashSet<Character> seen = new HashSet<>();
        HashSet<Character> dup = new HashSet<>();

        for (char c : s.toCharArray()){
            if (!seen.add(c)) dup.add(c);
        }
        System.out.println(dup);
    }
}
