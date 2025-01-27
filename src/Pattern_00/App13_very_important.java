package Pattern_00;
/*
1      1
12    21
123  321
12344321
 */
public class App13_very_important {
    public static void main(String[] args) {
        int n = 4;
        int spaces = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // give space
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            spaces = spaces-2;
            System.out.println();

        }
    }
}
