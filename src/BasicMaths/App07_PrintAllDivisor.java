package BasicMaths;

public class App07_PrintAllDivisor {
    public static void main(String[] args) {
        int N = 4;
        int sum = 0;

        while (N > 0) {
            for (int i = N; i > 0; i--) {
                if (N % i == 0) {
                    sum += i;
                }
            }
            N--;
        }
        System.out.println(sum);
    }
}
