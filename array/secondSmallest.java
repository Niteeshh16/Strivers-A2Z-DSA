package array;

public class secondSmallest {
    static int secondsmall(int[] nums){

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int n : nums){
            if (n < first) {
                second = first;
                first = n;
            } else if (n < second && n != first) {
                        second = n;
                }
            }
        return second;

    }
    public static void main(String[] args) {
        int[] nums = {234,234,12,4,232,341};
        System.out.println(secondsmall(nums));
    }
}
