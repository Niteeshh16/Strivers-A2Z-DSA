// Question: Find the first missing positive number using binary search
package array;

import java.util.ArrayList;
import java.util.List;

public class AllMissingElement {

    static List<Integer> findFirstMissing(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        int expected = 0;
        for (int num : nums){
            while (expected < num){
             if (num == k){
                 result.add(expected);
             }
                expected++;
            }
            expected++;

        }
        return result;
    }


    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 7, 11};
        int k = 5;
        System.out.println(findFirstMissing(nums,k));
    }
}
