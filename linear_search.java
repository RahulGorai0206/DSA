import java.util.*;            //import java utils
class linear_search{
    public static int linear(int arr[],int key){    // function for Linear search
        for(int i=0;i<arr.length;i++){       // loop for treversing the whole array from to full lenth
            if(arr[i]==key){          // if the number matches the  return the index
                return i;
            }
        }
        return -1; // if not matches then return -1
    }
    public static void main(String a[]){    // main function
        int arr[]={12,20,73,93,03,73,73};
        int index;
        Scanner sc =new Scanner(System.in);     // created new scanner class
        System.out.print("\nEnter the number: ");       // for input
        int key=sc.nextInt();
        index=linear(arr,key);      // passing the array and the number
        if(index<0){        // print according to the input
            System.out.println("Number Not Found\n");
        }
        else{
            System.out.println("The Index of "+key+" is "+index+"\n");
        }
    }
}