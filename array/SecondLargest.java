package array;

// Program to find the second largest element in an array
public class SecondLargest {
    static int secondLar(int[] arr){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
         return second;

    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 15};
        System.out.println(secondLar(arr));
    }
}

