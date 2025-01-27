package Pattern_00;

/*
     *
    ***
   *****
  *******
 *********

 */
public class App08_important {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            // this loop is for printing space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= 2 * i + 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
