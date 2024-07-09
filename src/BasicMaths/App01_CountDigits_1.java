package BasicMaths;

public class App01_CountDigits_1 {
    static int evenlyDivides(int N) {
        int count = 0;
        int dividor = N;
        int originalValue = N;
        while (N != 0) {
            int lastDigit = N % 10;
            if (lastDigit > 0 && originalValue % lastDigit == 0) {
                count++;
            }
            N = N / 10;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(evenlyDivides(22074));
    }
}
