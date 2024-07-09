package BasicMaths;

public class App05_CalculateLCM_GCD {

    static Long findGCD(Long A, Long B) {
        // If b is 0, then the GCD is a.
        // Otherwise, set a to b and b to a % b, and repeat step 1.
        while (B != 0) {
            Long temp = B;
            B = A % B;
            A = temp;
        }
        return A;
    }

    public static void main(String[] args) {
        // to calculate LCM you need to calculate GCD first
        Long A = 14L;
        Long B = 8L;

        long gcd = findGCD(A, B);
        long lcm = (A * B) / gcd;
    }

}
