package BasicMaths_01;

public class App02_CountDigits_2 {
    static int countTotalDigits(int N) {
        int count = 0;
        while (N != 0) {
            count++;
            N = N / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countTotalDigits(123456789));


    }
}
