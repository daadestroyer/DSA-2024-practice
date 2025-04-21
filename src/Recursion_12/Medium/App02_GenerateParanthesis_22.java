package Recursion_12.Medium;

import java.util.ArrayList;
import java.util.List;

public class App02_GenerateParanthesis_22 {

    public static boolean valid(char[] res) {
        int bal = 0;
        for (char c : res) {
            if (c == '(') {
                bal++;
            } else {
                bal--;
            }
            if (bal < 0) {
                return false;
            }
        }
        return bal == 0;
    }

    public static void generateParanthesis(ArrayList<String> fres, char[] res, int idx) {
        if (idx == res.length) {
            if (valid(res)) {
                fres.add(new String(res));
            }
            return;
        }

        // left call
        res[idx] = '(';
        generateParanthesis(fres, res, idx + 1);

        // right call
        res[idx] = ')';
        generateParanthesis(fres, res, idx + 1);
    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<String> res = new ArrayList<>();
        generateParanthesis(res, new char[n * 2], 0);
        System.out.println(res);
    }
}
