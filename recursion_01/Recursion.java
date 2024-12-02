package recursion_01;

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

    public static void main(String[] args) {
        int num = 6;
        System.out.println(fibnocci(num));
        func(6, 6);
        System.out.println(factorial(4));
        int arr[] = { 1, 2, 3, 4, 5, 6 };
    }

}