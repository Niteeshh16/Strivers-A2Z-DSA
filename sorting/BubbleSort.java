package sorting;

public class BubbleSort {
    static void bubbleSort(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-i-1; j++) {
                if(nums[j] >nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {234,532,23,444,522,342};
        bubbleSort(nums);

        for (int num : nums){
            System.out.print(num + " ");
        }

    }
}
