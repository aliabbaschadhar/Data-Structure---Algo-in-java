package hashing_02;

import java.util.Arrays;
import java.util.Scanner;

public class Hashing {
    /**
     * Method to count occurrences of a number in an array without using hashing
     * Time Complexity: O(n) - where n is the array length
     */
    public static Integer numOfele(Integer[] arr, Integer num) {
        Integer count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Step 1: Get array size and create array
        int size = scan.nextInt();
        int arr[] = new int[size];

        // Step 2: Initialize array with input values
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        // Print array for verification
        System.out.println(Arrays.toString(arr));

        // Step 3: Create hash array
        // Find maximum element to determine hash array size
        int hashSize = Arrays.stream(arr).max().getAsInt();
        // Create hash array with size = max_element + 1 (to include the max element)
        int[] hash = new int[hashSize + 1];
        // Initialize hash array with zeros
        Arrays.fill(hash, 0);
        
        // Step 4: Fill hash array with frequencies
        // Count frequency of each element
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++; // Increment count at index equal to array element
        }

        // Step 5: Process queries
        // Get number of queries
        int queries = scan.nextInt();
        // Process each query
        while (queries > 0) {
            int number = scan.nextInt();
            // Print frequency of queried number
            System.out.println(number + " has occured " + hash[number] + " times");
            queries--;
        }

        // Close scanner to prevent resource leak
        scan.close();
    }
}
