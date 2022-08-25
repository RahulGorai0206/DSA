// Pint arrays in pairs
public class pairs_array {
    public static void pair(int arr[]){
        for(int i=0;i<arr.length;i++){  // loop for the first number
            for(int j=i+1;j<arr.length;j++){        // loop for the second number (this will be i+1)
                System.out.print(" ("+arr[i]+","+arr[j]+") "); // print OFC
            }
            System.out.print("\n"); // just for new line huh
        }
    }
    public static void main (String a[]){
        int arr[]={2,4,6,8,10};
        pair(arr);
    }
}
