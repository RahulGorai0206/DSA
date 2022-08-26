// the previous question in prefix method // in this method we are taking another array to store prefix values
public class MaxSubarraySum_UsingPrefix {
    public static int subarray_sum(int arr[]) {
        int prefix[] = new int[arr.length];         // declaring and initilizing of the prefix array 
        int sum = 0, max = Integer.MIN_VALUE;
        prefix[0] = arr[0];         // we know that the starting value of the array will be same
        for (int i = 1; i < arr.length; i++) {      // loop for treversing
            prefix[i] = arr[i] + prefix[i - 1];     // generating the sums of prefix array
        }
        for (int i = 0; i < prefix.length; i++) {           // loop for calculating the sum of sub arrays
            sum = 0;
            for (int j = i; j < prefix.length; j++) {
                sum = i==0? prefix[j]: prefix[j] - prefix[i - 1]; // setting a condition that the sum of first element is the value of first element itself
            }
            if (sum > max) {
                max = sum;
            }
            System.out.print(sum + " ");
        }
        return max;
    }

    public static void main(String a[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println("\nMax sum is: " + subarray_sum(arr));
    }
}


// OUTPUT
// 15 14 12 9 5 
// Max sum is: 15