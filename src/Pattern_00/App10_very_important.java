package Pattern_00;
/*
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
 */
public class App10_very_important {
    public static void main(String[] args) {
        int n = 5;
        // upper triangle
        for (int i = 0; i < n; i++) {
            // print space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // print star
            for (int k = 1; k <= 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // lower triangle
        for (int i = 0; i < n; i++) {
            // print space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // print star
            for (int k = 0; k < n * 2 - (2 * i + 1) ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
