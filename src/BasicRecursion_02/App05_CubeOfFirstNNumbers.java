package BasicRecursion_02;

public class App05_CubeOfFirstNNumbers {
    static long findSum(long n, long sum) {
        if (n == 0) {
            return sum;
        }
        return findSum(n - 1, sum + (long) Math.pow(n, 3));
    }

    public static void main(String[] args) {
        long n = 5;
        long sum = 0;
        System.out.println(findSum(n, sum));
    }
}
