package Pattern_00;

/*
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 */
public class App07 {
    public static void main(String[] args) {
        int n = 5;
        int counter = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= counter; j++) {
                System.out.print(j + " ");
            }
            counter--;
            System.out.println();
        }
    }
}
