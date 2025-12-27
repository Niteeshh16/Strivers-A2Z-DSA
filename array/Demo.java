package array;

public class Demo {
    static int largest(int[] nums) {
        int first = 0;
        int second = 0;

        for (int num : nums){
            if (num > first){
                second = first;
                first = num;

            }
            else if (num > second && num != first) {
                second = num;
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int[] nums = {23,454,5,234,544};
        System.out.println(largest(nums));
    }
}
