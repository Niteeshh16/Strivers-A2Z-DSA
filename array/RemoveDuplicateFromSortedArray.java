package array;

public class RemoveDuplicateFromSortedArray {
    static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1; // length of unique elements
    }

    public static void main(String[] args) {
        int[] nums = {23, 23, 45, 45, 57};
        int len = removeDuplicates(nums);
        System.out.println("Unique count: " + len);
        System.out.print("Array after removing duplicates: ");
        for (int k = 0; k < len; k++) {
            System.out.print(nums[k] + " ");
        }
    }
}
