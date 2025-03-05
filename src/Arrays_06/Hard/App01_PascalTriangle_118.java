package Arrays_06.Hard;

import java.util.ArrayList;
import java.util.List;

public class App01_PascalTriangle_118 {
    static List<List<Integer>> generate(int n) {
        List<List<Integer>> fres = new ArrayList<>();
        List<Integer> cres = null;
        List<Integer> pres = null;

        for (int i = 0; i < n; i++) {
            cres = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    cres.add(1);
                } else {
                    cres.add(pres.get(j - 1) + pres.get(j));
                }
            }
            fres.add(cres);
            pres = cres;
        }
        return fres;
    }


    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> res = generate(n);
        System.out.println(res);
    }
}
