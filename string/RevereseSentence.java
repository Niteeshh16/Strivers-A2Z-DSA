package string;

public class RevereseSentence {
    public static void main(String[] args) {
        String  s = " hello my name is niteesh";
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");

        for (int i = words.length-1; i >= 0; i--){
            sb.append(words[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
