// Reverse an array it's easy really
public class reverse_array {
    public static void reverse(int arr[]){
        int start =0,end =arr.length-1;         // set end and start
        while(start<end){
            int temp=arr[start];                // store start value to container
            arr[start]=arr[end];                // replace start value with end value
            arr[end]=temp;                      // store the temp value to end
            start ++;       // increse the start pointer
            end --;         // decrese the end pointer
        }
    }
    public static void main (String a[]){ // u all know this
        int arr[]={55,74,973,8,3,745,63,53,83};
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
