package array;

import java.util.HashSet;
import java.util.Set;

public class UnionOfArrays {
    public static void main(String[] args) {
            int[] num1 = {123,34,32,4234};
            int[] num2 = {234,123,32,23};

        Set<Integer> unionSet = new HashSet<>();

                for(int num : num1){
                    unionSet.add(num);
                }
                for (int num : num2){
                    unionSet.add(num);
                }
        System.out.println(unionSet);
    }
}
