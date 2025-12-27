package array;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]){
                    System.out.println(nums[j]);
                }
            }
        }

    }
}
