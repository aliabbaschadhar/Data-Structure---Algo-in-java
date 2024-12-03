package recursion_01;

import java.util.*;

public class Recursion {

    public static int fibnocci(int fib) {
        if (fib == 0 || fib == 1)
            return 1;
        return fibnocci(fib - 1) + fibnocci(fib - 2);
    }

    // Iterative
    public static int sumOfFirstNum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }

    // recursive
    public static int sumOf(int num) {
        if (num < 1) {
            return 0;
        }
        return num + sumOf(num - 1);
    }

    // 1 to N
    public static void func(int i, int n) {
        if (i <= 0)
            return;
        System.err.println(i);
        func(i - 1, n);
    }

    static int factorial(int num) {
        if (num == 0)
            return 1;
        return num * factorial(num - 1);
    }

    // Reversing an array
    public static int[] reverse(int arr[], int size) {
        for (int i = 0, j = size - 1; i < arr.length / 2; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

    // recursive reversing
    public static int[] recursiveReverse(int arr[], int i, int j) {
        if (i >= j)
            return arr;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return recursiveReverse(arr, i + 1, j - 1);
    }

    private static int size;

    // reversing using single pointer
    public static int[] singlePointerReverse(int[] arr, int i) {
        if (i == 0)
            size = arr.length;
        if (i >= arr.length / 2) {
            size = 0;
            return arr;
        }
        int temp = arr[i];
        arr[i] = arr[size - i - 1];
        arr[size - i - 1] = temp;
        return singlePointerReverse(arr, i + 1);
    }

    // checking a string is a palindrom or not
    public static boolean isPalindrom(String string) {
        if (string.isBlank())
            return false;
        char[] stringtoChar = string.toCharArray();
        for (int i = 0, j = stringtoChar.length - 1; i < stringtoChar.length / 2; i++, j--) {
            if (stringtoChar[i] != stringtoChar[j]) {
                return false;
            }
        }
        return true;
    }

    // recursive palindrom
    // private static char[] stringtoChar;
    private static int length;

    public static boolean isPalindromRecursive(String string, int i) {
        if (i == 0 && string.isBlank()) {
            return false;
        }
        length = string.length();
        if (i >= (length / 2))
            return true;
        char[] stringtoChar = string.toCharArray();
        if (stringtoChar[i] != stringtoChar[length - i - 1]) {
            return false;
        }
        return isPalindromRecursive(string, i + 1);
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