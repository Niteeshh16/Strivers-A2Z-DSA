package array;

public class SmallestElementInAnArray {
    static int findSmallest(int[] nums){
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min){
                min = nums[i];

            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] nums ={23,45,23,1,34};
        System.out.println(findSmallest(nums));
    }
}
