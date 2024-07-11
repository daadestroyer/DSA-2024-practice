package BasicMaths_01;

public class App07_PrintAllDivisor {
    public static int naiveApproach(int N) {
        int sum = 0;

        while (N > 0) {
            for (int i = N; i > 0; i--) {
                if (N % i == 0) {
                    sum += i;
                }
            }
            N--;
        }
        return sum;
    }

    static int divisorOfNo(int N) {
        int sum = 0;
        for (int i = 1; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                sum += i;
                if (i != sum / i) {
                    sum += N / i;
                }
            }
        }
        return sum;
    }

    public static int optimalApproach(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += divisorOfNo(i);
        }
        return sum;
    }

    public static void main(String[] args) {

        int N = 4;
//        System.out.println(naiveApproach(N));
        System.out.println(optimalApproach(N));


    }
}
