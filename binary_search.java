// Binary search remember it will only work for sorted arrays..

import java.util.*;

public class binary_search {
    public static int binary(int arr[], int key) {
        int start = 0, end = arr.length - 1; // declair the start and the end
        while (start <= end) {
            int mid = (start + end) / 2; // set the mid using this formula
            if (arr[mid] == key) {
                return mid; // if mid matches then return it
            } else if (arr[mid] < key) {
                start = mid + 1; // if mid is less than key the set start as mid +1
            } else {
                end = mid - 1; // if not then set end as mid-1
            }
        }
        return -1; // otheewise return -1
    }

    public static void main(String a[]) { // u know this section i will never explain it again if it's simplw as before
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Enter the number bruh: "); // input
        int key = sc.nextInt();
        int arr[] = { 10, 22, 32, 42, 54, 69, 86, 99, 1345 };
        int result = binary(arr, key);
        if (result == -1) {
            System.out.println("\n Element not found");
        } else {
            System.out.println("\n The index of the number " + key + " is " + result);
        }
    }
}