package recursion_01;

import java.util.*;

public class Recursion {

    public static int fibnocci(int fib) {
        // Base case: If fib is 0 or 1, return 1
        if (fib == 0 || fib == 1)
            return 1;
        // Recursive call: Calculate Fibonacci number for fib-1 and fib-2
        return fibnocci(fib - 1) + fibnocci(fib - 2);
    }

    public static int sumOfFirstNum(int num) {
        // Initialize sum to 0
        int sum = 0;
        // Iterate from 1 to num and add each number to sum
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumOf(int num) {
        // Base case: If num is less than 1, return 0
        if (num < 1) {
            return 0;
        }
        // Recursive call: Add num to sum of first num-1 numbers
        return num + sumOf(num - 1);
    }

    public static void func(int i, int n) {
        // Base case: If i is less than or equal to 0, return
        if (i <= 0)
            return;
        // Print the current number
        System.err.println(i);
        // Recursive call: Print numbers from i-1 to 1
        func(i - 1, n);
    }

    static int factorial(int num) {
        // Base case: If num is 0, return 1
        if (num == 0)
            return 1;
        // Recursive call: Multiply num with factorial of num-1
        return num * factorial(num - 1);
    }

    public static int[] reverse(int arr[], int size) {
        // Iterate from start and end of the array and swap elements
        for (int i = 0, j = size - 1; i < arr.length / 2; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

    public static int[] recursiveReverse(int arr[], int i, int j) {
        // Base case: If i is greater than or equal to j, return the array
        if (i >= j)
            return arr;
        // Swap elements at i and j
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        // Recursive call: Reverse the rest of the array
        return recursiveReverse(arr, i + 1, j - 1);
    }

    // Class level variable for single pointer reverse
    private static int size;

    public static int[] singlePointerReverse(int[] arr, int i) {
        // Initialize size on first call (when i=0)
        if (i == 0)
            size = arr.length;
        // Base case: If we've reached the middle of the array, return
        if (i >= arr.length / 2) {
            size = 0;
            return arr;
        }
        // Swap elements at i and size-i-1
        int temp = arr[i];
        arr[i] = arr[size - i - 1];
        arr[size - i - 1] = temp;
        // Recursive call: Reverse the rest of the array
        return singlePointerReverse(arr, i + 1);
    }

    public static boolean isPalindrom(String string) {
        // If string is blank, return false
        if (string.isBlank())
            return false;
        // Convert string to char array
        char[] stringtoChar = string.toCharArray();
        // Iterate from start and end of the string and compare characters
        for (int i = 0, j = stringtoChar.length - 1; i < stringtoChar.length / 2; i++, j--) {
            // If characters don't match, return false
            if (stringtoChar[i] != stringtoChar[j]) {
                return false;
            }
        }
        // If all characters match, return true
        return true;
    }

    // Class level variable for recursive palindrome check
    private static int length;

    public static boolean isPalindromRecursive(String string, int i) {
        // Base case 1: If string is blank and we're at the start (i=0), return false
        if (i == 0 && string.isBlank()) {
            return false;
        }
        // Initialize length on first call (when i=0)
        length = string.length();
        // Base case 2: If we've checked half the string, it's a palindrome
        if (i >= (length / 2))
            return true;
        // Convert string to char array for character comparison
        char[] stringtoChar = string.toCharArray();
        // If characters at mirror positions don't match, not a palindrome
        if (stringtoChar[i] != stringtoChar[length - i - 1]) {
            return false;
        }
        // Recursive call: move to next character pair
        return isPalindromRecursive(string, i + 1);
    }

    public static boolean isPalindromShort(String string, int i) {
        // Base case: If we've checked half the string, it's a palindrome
        if (i >= string.length() / 2)
            return true;
        // If characters at mirror positions don't match, not a palindrome
        if (string.charAt(i) != string.charAt(string.length() - i - 1))
            return false;
        // Recursive call: Check next character pair
        return isPalindromShort(string, i + 1);
    }

    public static void main(String[] args) {
        int num = 6;
        System.out.println(fibnocci(num));
        func(6, 6);
        System.out.println(factorial(4));
        int arr3[] = { 1, 2, 3, 4, 5, 6 };
        // System.out.println(Arrays.toString(recursiveReverse(arr, 0, 4)));
        Integer arr2[] = { 2, 3, 6, 32, 12 };
        Collections.reverse(Arrays.asList(arr2));
        System.out.println(Arrays.toString(arr2));

        System.out.println(Arrays.toString(singlePointerReverse(arr3, 0)));

        System.out.println(isPalindromRecursive("boy", 0));

    }

}