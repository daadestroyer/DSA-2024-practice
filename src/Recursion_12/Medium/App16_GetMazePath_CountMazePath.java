package Recursion_12.Medium;

import java.util.ArrayList;

public class App16_GetMazePath_CountMazePath {
    public static void main(String[] args) {
        ArrayList<String> ds = new ArrayList<>();
        int count = countMazePath(0, 0, 2, 2, "", ds);
        System.out.println("Count = " + count);
        getMazePath(0, 0, 2, 2, "", ds);
        System.out.println(ds);
    }

    private static int countMazePath(int CR, int CC, int ER, int EC, String ans, ArrayList<String> ds) {
        if (CR == ER && CC == EC) {
            ds.add(ans);
            return 1;
        }
        if (CR > ER || CC > EC) {
            return 0;
        }
        // horizontal move
        int res1 = 0;
        res1 += countMazePath(CR, CC + 1, ER, EC, ans + "H", ds);

        // vertical move
        int res2 = 0;
        res2 += countMazePath(CR + 1, CC, ER, EC, ans + "V", ds);
        return res1 + res2;
    }

    private static void getMazePath(int CR, int CC, int ER, int EC, String ans, ArrayList<String> ds) {
        if (CR == ER && CC == EC) {
            ds.add(ans);
            return;
        }
        if (CR > ER || CC > EC) {
            return;
        }

        // horizontal move
        getMazePath(CR, CC + 1, ER, EC, ans + "H", ds);

        // vertical move
        getMazePath(CR + 1, CC, ER, EC, ans + "V", ds);
    }
}
