package DynamicProgramming_15.OneD_Dp_01;

import java.util.HashMap;
import java.util.Map;

public class App02_ClimbStairs_79 {
    public static int letsClimb(int n, int curr, Map<Integer, Integer> dp) {
        if (curr == n) return 1;
        if (curr > n) return 0;

        if (dp.containsKey(curr)) {
            return dp.get(curr);
        }
        int way1 = letsClimb(n, curr + 1, dp);
        int way2 = letsClimb(n, curr + 2, dp);
        int total = way1 + way2;
        dp.put(curr, total);
        return total;
    }

    public static void main(String[] args) {
        Map<Integer, Integer> dp = new HashMap<>();
        int ans = letsClimb(5, 0, dp);
        System.out.println(ans);
    }
}
