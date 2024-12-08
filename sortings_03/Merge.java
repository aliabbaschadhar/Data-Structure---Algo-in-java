package sortings_03;

import java.util.*;

/**
 * Implementation of Merge Sort algorithm
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 */
public class Merge {
    static void merge(int[] arr, int low, int mid, int high) {
        // Temporary list to store merged result
        List<Integer> result = new ArrayList<>();

        // Pointers for the two subarrays
        int left = low; // Start of first subarray
        int right = mid + 1; // Start of second subarray

        // Compare and merge elements from both subarrays
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                result.add(arr[left]);
                left++;
            } else {
                result.add(arr[right]);
                right++;
            }
        }

        // If first subarray has remaining elements, add them
        while (left <= mid) {
            result.add(arr[left++]);
        }

        // If second subarray has remaining elements, add them
        while (right <= high) {
            result.add(arr[right++]);
        }

        // Copy merged elements back to original array
        // Using (low + i) to maintain correct position in the original array
        for (int i = 0; i < result.size(); i++) {
            arr[low + i] = result.get(i);
        }
    }

    static void mergeSort(int[] arr, int low, int high) {
        // Base case: single element is already sorted
        if (low == high)
            return;

        // Find middle point to divide array into two halves
        int mid = (low + high) / 2;

        // Recursively sort first and second halves
        mergeSort(arr, low, mid); // Sort left half
        mergeSort(arr, mid + 1, high); // Sort right half

        // Merge the sorted halves
        merge(arr, low, mid, high);
    }

    public static void main(String[] args) {
        // Test array
        int[] arr = { 1, 2, 11, 21, 12, 523, 221, 152 };
        int size = arr.length - 1;

        // Sort the array
        mergeSort(arr, 0, size);

        // Print sorted array
        System.out.println(Arrays.toString(arr));
    }
}
