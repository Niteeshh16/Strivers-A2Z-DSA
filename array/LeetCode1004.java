// LeetCode 1004: Max Consecutive Ones III
package array;

public class LeetCode1004 {

    static int maxContinuoesOnes(int[] nums, int k) {

        int left = 0;
        int zeros = 0;
        int maxLen = 0;

        for (int right = 0; right < nums.length; right++) {


            if (nums[right] == 0) {
                zeros++;
            }


            while (zeros > k) {
                if (nums[left] == 0) {
                    zeros--;
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {

        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;

        int result = maxContinuoesOnes(nums, k);
        System.out.println(result);
    }
}
