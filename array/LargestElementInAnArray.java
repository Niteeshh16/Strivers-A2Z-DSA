package array;

public class LargestElementInAnArray {
    static int findlargest(int[] nums){
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < min){
                min = nums[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] nums ={23,452,34,45,234,231,1,};
        System.out.println(findlargest(nums));
    }
}
