package Pattern_00;
/*
1
01
101
0101
10101
 */
public class App12_very_important {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(1);
        int start = 0;
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                start = 1;
            } else {
                start = 0;
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }

    }
}
