package BasicMaths;

public class App08_PrimeNo {
    public static void main(String[] args) {
        int number = 10;

        if (number <= 1) {
            System.out.println("not prime");
        }
        if (number == 2 || number == 3) {
            System.out.println("prime");
        }
        if (number % 2 == 0 || number % 3 == 0) {
            System.out.println("not prime");
        }
    }
}
