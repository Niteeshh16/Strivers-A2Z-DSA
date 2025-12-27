package array;

public class ReverseArray {
    public static void main(String[] args) {
        int nums[] = {1,2,4,54};

        int left = 0;
        int right = nums.length-1;

        while (left < right){
            int temp = nums[0];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
        for (int num : nums){
            System.out.print(num + " ");
        }

    }
}
