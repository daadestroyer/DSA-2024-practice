package Pattern_00;

/*
 *
 **
 ***
 ****
 *****
 ****
 ***
 **
 *
 */
public class App11_very_important {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            // print star
            for(int j=0 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0 ; i<n-1 ; i++){
            // print star
            for(int j=i ; j<n-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
