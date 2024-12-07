package sortings_03;

import java.util.*;

public class Insertion {
    /**
     * Sorts an array using the insertion sort algorithm in ascending order.
     * Time Complexity: O(n²) where n is the size of array
     * Space Complexity: O(1) as it uses only a constant amount of extra space
     */
    static void insertionSort(int[] arr) {
        // Iterate through array starting from the first element
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            // Keep moving the current element left as long as it's smaller than the previous element
            while (j > 0 && arr[j] < arr[j - 1]) {
                // Swap current element with the previous element
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;    // Move to previous position to continue comparing
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 9, 12, 20, 33, 6, 5 };
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
