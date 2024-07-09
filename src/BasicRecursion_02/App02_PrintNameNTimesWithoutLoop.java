package BasicRecursion_02;

public class App02_PrintNameNTimesWithoutLoop {
    static void printGfg(int N,String s) {
        if(N == 0){
            return;
        }
        System.out.print(s);
        printGfg(N-1,s);
    }
    public static void main(String[] args) {
        printGfg(10,"thecoderstv"+" ");
    }
}
