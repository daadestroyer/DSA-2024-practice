package Pattern_00;

/*

*********
 *******
  *****
   ***
    *
 */
public class App09_important {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            // printing spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // printing stars
            for (int k = 0; k < 2 * n - (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
