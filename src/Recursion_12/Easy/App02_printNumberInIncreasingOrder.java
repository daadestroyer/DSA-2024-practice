package Recursion_12.Easy;

public class App02_printNumberInIncreasingOrder {

    public static void printNumberInIncreasingOrder(int n){
        if(n == -1){
            return;
        }
        printNumberInIncreasingOrder(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        printNumberInIncreasingOrder(5);
    }
}
