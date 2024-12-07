package sortings_03;

import java.util.*;

/**
 * Implementation of Selection Sort algorithm
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 * This sorting algorithm divides the array into a sorted and unsorted region,
 * and repeatedly selects the smallest element from the unsorted region to place at the end of the sorted region.
 */
public class Selection {

    /**
     * Sorts an integer array in ascending order using Selection Sort algorithm
     */
    static void SelectionSort(int[] arr, int size) {
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < size - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < size; j++) {
                // If current element is smaller than minimum found so far
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            // Swap the found minimum element with the first element of unsorted region
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    /**
     * Main method to demonstrate Selection Sort with a sample array
     */
    public static void main(String[] args) {
        // Example array to sort
        int[] arr = { 1, 21, 12, 11, 22, 55, 23, 789, 32 };
        SelectionSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}