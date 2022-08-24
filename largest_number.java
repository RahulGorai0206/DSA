// Find the largest number in array using linear search

import java.util.*;

public class largest_number {
    public static int largest(int arr[]) {
        int temp = Integer.MIN_VALUE; // temporary varibale for storing the largest number initilized with minimum integer number
        for (int i = 0; i < arr.length-1; i++) {
            if (temp < arr[i]) { // if the current number in larger than previous then store in temp
                temp = arr[i];
            }
        }
        return temp; // returning temp which is the largwst number in the array
    }

    public static void main(String a[]) {
        int arr[] = { 10, 50, 64, 942, 62, 563, 2562, 1, 53, 12, 5 }; // creating array
        int num = largest(arr); // call function and storing number
        System.out.println("\n The largent number in the array is: " + num); // printing
    }
}