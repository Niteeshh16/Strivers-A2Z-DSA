package sorting;

public class SelectionSort {
    static void selectionSort(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int min = i;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j] < nums[min]){
                    min = j;

                }
            }
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;



        }
    }
    public static void main(String[] args) {
        int[] nums = {234,23,43,53,45};
        selectionSort(nums);
        for (int num : nums){
            System.out.print(num +" ");
        }

    }
}
