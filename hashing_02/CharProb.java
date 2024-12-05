package hashing_02;

import java.util.*;

/**
 * This class demonstrates character frequency counting using HashMap
 * It counts occurrences of each character in a string and allows querying frequencies
 */
public class CharProb {
    public static void main(String[] args) {
        // Initialize Scanner for reading input
        Scanner scan = new Scanner(System.in);

        // Input string converted to lowercase for case-insensitive counting
        String string = "abaadabacceedabefghijklmo".toLowerCase();

        // Create HashMap to store character frequencies
        // Key: character, Value: frequency of that character
        Map<Character, Integer> charMap = new HashMap<>();

        // Convert string to char array and count frequency of each character
        for (char ch : string.toCharArray()) {
            // getOrDefault returns current value for key 'ch', or 0 if key doesn't exist
            // Then increment the count by 1 and store it back in the map
            charMap.put(ch, charMap.getOrDefault(ch, 0) + 1);
        }

        // Read number of queries
        int queries = scan.nextInt();

        // Process each query
        while (queries-- > 0) {
            // Read a character and convert to lowercase to match our stored frequencies
            char letter = scan.next().trim().toLowerCase().charAt(0);
            
            // Print frequency of the queried character
            // If character doesn't exist in map, getOrDefault returns 0
            System.out.println("The " + letter + " has occured " + 
                             charMap.getOrDefault(letter, 0) + " times ");
        }

        // Close scanner to prevent resource leak
        scan.close();
    }
}
