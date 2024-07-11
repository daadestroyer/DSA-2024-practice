package BasicRecursion_02;

import java.util.ArrayList;

public class App06_FactorialOfNNumbers {
    static void findFactorial(long n, ArrayList<Long> list , long fact, long increment) {
        if (fact > n) {
            return;
        }
        fact *= increment;
        if(fact <= n){
            list.add(fact);
        }
        findFactorial(n,list,fact,++increment);
    }

    public static void main(String[] args) {
        ArrayList<Long> list = new ArrayList<>();
        long n = 6;
        long fact = 1;
        long increment = 1;
        findFactorial(n, list, fact, increment);
        System.out.println(list);
    }
}
