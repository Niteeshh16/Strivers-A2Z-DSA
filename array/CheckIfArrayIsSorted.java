package array;

public class CheckIfArrayIsSorted {

    static boolean check(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums = {23,4,123,34,34,123};
        int[] nums2 = {12,23,34,455};
        System.out.println(check(nums));
        System.out.println(check(nums2));

    }
}
