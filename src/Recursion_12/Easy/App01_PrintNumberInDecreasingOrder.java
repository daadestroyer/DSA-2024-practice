package Recursion_12.Easy;

public class App01_PrintNumberInDecreasingOrder {
    public static void printNumberInDecreasingOrder(int n){
        if(n == -1){
            return;
        }
        System.out.println(n);
        printNumberInDecreasingOrder(n-1);
    }

    public static void main(String[] args) {
        printNumberInDecreasingOrder(5);
    }
}
