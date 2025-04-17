package Recursion_12.Easy;

public class App04_NthFibonacciNumber {


    public static void main(String[] args) {
        // 0 1 2 3 5
        System.out.println(nthFibonacciNumber(5));
    }

    private static int nthFibonacciNumber(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return nthFibonacciNumber(n - 1) + nthFibonacciNumber(n - 2);
    }
}
