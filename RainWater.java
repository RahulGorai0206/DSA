// Trapped Rain-Water collection using arrays
public class RainWater {
    public static int rain(int arr[]) {
        int total = 0, curr = 0;
        int ml[] = new int[arr.length], mr[] = new int[arr.length]; // making MaxLeft & MaxRight array for storing Max right and left column of any element
        for (int i = 0; i < arr.length; i++) {          // for calculating the MaxLeft values of each element
            if (i == 0) {       // if the element is starting element then set it as 0
                ml[i] = arr[i];       
            } else if (ml[i - 1] < arr[i]) {    // if its smaller than the main array element then kang the value
                ml[i] = arr[i];
            } else {
                ml[i] = ml[i - 1];      // if not then kang the previous values
            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {     // for calculating the MaxRight value of each element AND make sure to run the loop in reverse order cus we are treversing right to left hehe
            if (i == arr.length - 1) {          // if the element is the last element then set it as the value of the last element of the main array
                mr[i] = arr[i];         
            } else if (mr[i + 1] < arr[i]) {        // if the value of mr array is less then main array then kang the value from main array
                mr[i] = arr[i];
            } else {
                mr[i] = mr[i + 1];              // if not then kang the value of right element
            }
        }
        for (int i = 0; i < arr.length; i++) {
            curr = 0;
            if (ml[i] == arr[i]) {          // if the MaxLeft is same as the value of the element then it can't store water so set it to 0
                curr = 0;
            } else if (mr[i] == arr[i]) {       // if the MaxRight is same as the value of the element then it can't store water so set it to 0
                curr = 0;
            } else {
                int min = Math.min(ml[i], mr[i]);       // get the min height of the water
                curr = (min - arr[i]);          // calculate the quantity of the water
            }
            total += curr;          // calculate the total water
        }
        return total;
    }

    public static void main(String a[]) {
        int arr[] = { 2, 2, 2, 4, 3, 8, 2 };
        System.out.println("Total Rainwater is: " + rain(arr));
    }
}


// OUTPUT
// Total Rainwater is: 1