package BasicRecursion_02;

public class App01_PrintNumberWithoutLoop {
    public static void printNos(int N) {
        if (N == 0) {
            return;
        }
        printNos(N - 1);
        System.out.print(N+" ");
    }

    public static void main(String[] args) {
        printNos(64);
    }
}
