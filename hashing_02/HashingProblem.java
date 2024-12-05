package hashing_02;

import java.util.*;

// Simple program to count frequency of numbers using HashMap
public class HashingProblem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Store input numbers in ArrayList
        List<Integer> array = new ArrayList<>();
        int size = scan.nextInt();
        for (int i = 0; i < size; i++) {
            array.add(scan.nextInt());
        }

        // Count frequency using HashMap
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : array) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            // map.compute(num, (key,value)->(value==null)?1:value+1);
        }

        // // print the hashMap
        // System.out.println(map);
        // // using foreach
        // map.forEach((key, value) -> System.out.println("Key: " + key + "--> value: " + value));

        // Process queries and print frequencies

        int queries = scan.nextInt();
        while (queries-- > 0) {
            int number = scan.nextInt();
            System.out.println(number + " has occured " + map.getOrDefault(number, 0) + " times");
        }
        scan.close();

    }
}
