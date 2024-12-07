package sortings_03;

import java.util.*;

/**
 * Implementation of Bubble Sort Algorithm
 * Time Complexity: O(n²)(worst and average)
 * Best Case: O(n) when the array is already sorted
 * Space Complexity: O(1)
 */
public class Bubble {
    /**
     * Sorts an array using Bubble Sort algorithm.
     * After each iteration, the largest element "bubbles up" to the end.
     */
    static void bubbleSort(int[] arr) {
        int size = arr.length;
        boolean swapped;

        // Outer loop runs from first to last element
        for (int i = 0; i < size - 1; i++) {
            swapped = false;

            // Inner loop compares adjacent elements and swaps if needed
            // After i iterations, last i elements are already sorted
            for (int j = 0; j < size - 1 - i; j++) {
                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {
                    // Swap elements if they are in wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swapping occurred, array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = { 1, 11, 113, 878, 22, 112, 52, 88, 32 };
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
