package array;

public class RotateArrayBy1Times {
    static void rotate(int[] nums){
        int n = nums.length;
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i-1] = nums[i];
        }
        nums[n-1] = temp;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        rotate(nums);
       for (int num : nums){
           System.out.print(num + " ");
       }
    }
}
