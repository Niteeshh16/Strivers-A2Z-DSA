package string;

import java.util.HashMap;

public class CountCharecterUsingHashmap {
    public static void main(String[] args) {
        String s = "Hello this is niteesh";
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch , 0) +1);
        }
        System.out.println(map);
    }
}
