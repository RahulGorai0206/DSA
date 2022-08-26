// Print maximum sum for each sub-array and find the maximum sum value among the all sub-arrays
public class MaxSubarraySum_ofArray {
    public static int subarray_sum(int arr[]){
        int max=Integer.MIN_VALUE;
        int sum=0;          // must initilize variable after declairing
        for(int i=0;i<arr.length;i++){          // Loops are same as previous peogram
            for(int j=i;j<arr.length;j++){
                sum=0;       // setting sum as 0 on completion of each loop
                for(int k=i;k<=j;k++){
                    sum+=arr[k];        // setting the sum by adding each element of subarray
                }
                System.out.print(" "+sum+"  ");
                System.out.print("|");
                if(sum>max){            // setting a condition to store the value in "max" while the "sum" is larger than "max"
                    max=sum;
                }
            }
            System.out.println();
        }
        return max;
    }
    public static void main (String a[]){
        int arr[]={2,4,6,8,10};
        System.out.println("The Max Sum is: "+subarray_sum(arr));
    }
}


// OUTPUT 
// 2  | 6  | 12  | 20  | 30  |
// 4  | 10  | 18  | 28  |
// 6  | 14  | 24  |
// 8  | 18  |
// 10  |