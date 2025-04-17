package Recursion_12.Easy;

public class App08_SumOfFirstNNumbers {
    public static int sumOfFirstNNumbers(int n){
        if(n == -1){
            return 0;
        }
        return n + sumOfFirstNNumbers(n-1);
    }
    public static void main(String[] args) {

        System.out.println(sumOfFirstNNumbers(5));
    }
}
