package BasicRecursion_02;

public class App03_Print_NTo1_UsingRecursion {

    static void printNo_N_To_1(int N) {
        if (N == 0) {
            return;
        }
        System.out.print(N + " ");
        printNo_N_To_1(N-1);
    }

    public static void main(String[] args) {
        printNo_N_To_1(10);
    }
}
