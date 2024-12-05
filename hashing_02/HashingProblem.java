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
        // map.forEach((key, value) -> System.out.println("Key: " + key + "--> value: "
        // + value));

        // Process queries and print frequencies

        int queries = scan.nextInt();
        while (queries-- > 0) {
            int number = scan.nextInt();
            System.out.println(number + " has occured " + map.getOrDefault(number, 0) + " times");
        }
        // Finding the max and min keyValue pair
        Map.Entry<Integer, Integer> maxEntry = null;
        Map.Entry<Integer, Integer> minEntry = null;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
            if (minEntry == null || entry.getValue() < minEntry.getValue()) {
                minEntry = entry;
            }
        }

        System.out.println("Maximum frequency is: Number--> " + maxEntry.getKey() + " Value--> " + maxEntry.getValue());
        System.out.println("Minimum frequency is: Number--> " + minEntry.getKey() + " Value--> " + minEntry.getValue());

        scan.close();

    }
}
