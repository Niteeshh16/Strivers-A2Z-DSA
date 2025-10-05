package array;

public class LeftRotateByNTimes {
    static void rotate(int[] nums, int d) {
        int n = nums.length;
        d = d % n;

        for (int i = 0; i < d; i++) {
            int temp = nums[0];
            for (int j = 0; j < nums.length-1; j++) {
                nums[j] = nums[j+1];
            }
            nums[n-1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums ={2,334,45,342,123};
        int d = 2;
        rotate(nums,d);
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}
