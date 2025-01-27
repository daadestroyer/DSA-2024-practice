package Pattern_00;

/*
 * * * * *
 * * * *
 * * *
 * *
 *
 */
public class App05 {
    public static void main(String[] args) {
        int n = 5;
        int counter = n;
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=counter ; j++){
                System.out.print("* ");
            }
            counter--;
            System.out.println();
        }
    }
}
