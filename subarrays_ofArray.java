// Print subarrays of a array 
public class subarrays_ofArray {
    public static void subarray(int arr []){
        for(int i=0;i<arr.length;i++){          // first loop for starting of every line
            for(int j=i;j<arr.length;j++){      // second loop for managing end of every sub-array
                for(int k=i;k<=j;k++){          // third loop for treversing
                    System.out.print(arr[k]+","); // printing LOL
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void main (String a[]){
        int arr[]={2,4,6,8,10};
        subarray(arr);
    }
}

// OUTPUT
// 2,  2,4,  2,4,6,  2,4,6,8,  2,4,6,8,10,  
// 4,  4,6,  4,6,8,  4,6,8,10,  
// 6,  6,8,  6,8,10,  
// 8,  8,10,  
// 10,