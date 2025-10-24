package array;

public class MaximumConsecutiveOnes {
    static int findMaxConsecutives(int[] nums){
        int max = 0;
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 ){
                counter++;
                max = Math.max(counter, max);
            }
            else {
                counter = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums ={1,1,0,0,1,1,1,1,0,1};
        System.out.println(findMaxConsecutives(nums));

    }
}
