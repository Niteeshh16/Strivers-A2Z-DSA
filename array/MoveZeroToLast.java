// Q: Move all zeros in an array to the end

package array;

public class MoveZeroToLast {
    static void move(int[] nums) {
        int index = 0; // position for next non-zero element

        // move non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        // fill remaining positions with zeros
        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {23, 0, 123, 0, 0, 231};
        move(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
