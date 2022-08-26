// print max sum of all sub-array sums using kadane's alsorithm
public class MaxSubarraySum_KadaneAlgo {
    public static int sum(int arr[]) {
        int sum = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {      // loop for calculating the sum
            sum += arr[i];          // adding sum
            if (sum < 0) {          // applying kadane's algo which is "if your sum is negetive then set it to zero which is better"
                sum = 0;
            }
            if (sum > max) {
                max = sum;          // comparing the current with current max value
            }
        }
        return max;
    }

    public static void main(String a[]) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println("Max Value is: " + sum(arr));
    }
}


// OUTPUT
// Max Value is: 7