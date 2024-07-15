package BasicMaths_01;

import java.util.ArrayList;
import java.util.List;

public class App08_FibonacciSeries {
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13 21 34

        int n = 2;
        int A = 0;
        int B = 1;
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);

        for(int i=2  ; i< n ; i++){
            int sum = A+B;
            list.add(sum);
            A = B;
            B = sum;
        }
        System.out.println(list);
        System.out.println(list.get(n-1)+list.get(n-2));


    }
}
