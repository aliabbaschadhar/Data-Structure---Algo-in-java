package hashing_02;

import java.util.*;

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

        // Step 1: Create dynamic array list to store input elements
        List<Integer> array = new ArrayList<>();
        int size = scan.nextInt();

        // Step 2: Input array elements
        for (int i = 0; i < size; i++) {
            array.add(scan.nextInt());
        }

        // Step 3: Create and initialize hash array
        // Size of hash array = maximum element + 1 (to include the max element as valid
        // index)
        int sizeOfHash = Collections.max(array) + 1;
        Integer hash[] = new Integer[sizeOfHash];
        Arrays.fill(hash, 0); // Initialize all elements to 0

        // Step 4: Precompute frequencies
        // Count frequency of each element using hash array
        for (int i = 0; i < array.size(); i++) {
            hash[array.get(i)]++;
        }

        // Step 5: Process queries
        int queries = scan.nextInt();
        while (queries-- > 0) {
            int number = scan.nextInt();
            System.out.println(number + " has occured " + hash[number] + " times");
        }

        scan.close();
    }
}
