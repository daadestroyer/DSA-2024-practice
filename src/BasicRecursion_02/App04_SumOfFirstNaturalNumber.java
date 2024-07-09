package BasicRecursion_02;

public class App04_SumOfFirstNaturalNumber {
    static void sumOfNaturalNo(int n, int sum) {
        if (n == 0) {
            System.out.println(sum);
            return;
        }
        sumOfNaturalNo(n - 1, sum + n);
    }

    public static void main(String[] args) {
        sumOfNaturalNo(3, 0);
    }
}
