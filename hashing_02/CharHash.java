package hashing_02;

import java.util.Scanner;

public class CharHash {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read the input string
        String str = scan.next();

        // Create a hash array to store frequency of characters (a-z)
        // Index 0 represents 'a', 1 represents 'b', and so on
        int[] hash = new int[26];

        // Count frequency of each character in the input string
        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i) - 'a']++; // Subtract 'a' to map character to 0-25 range
        }

        // Process queries for character frequency
        int queries = scan.nextInt();
        while (queries > 0) {
            // Read character and print its frequency from hash array
            char ch = scan.next().charAt(0);
            System.out.println(hash[ch - 'a']);
            queries--;
        }
        scan.close(); // Close scanner to prevent resource leak
    }
}
