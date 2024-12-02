package recursion_01;

public class Recursion {

    public static int fibnocci(int fib) {
        if (fib == 0 || fib == 1)
            return 1;
        return fibnocci(fib - 1) + fibnocci(fib - 2);
    }

    public static void main(String[] args) {
        int num = 6;
        System.out.println(fibnocci(num));
    }
}