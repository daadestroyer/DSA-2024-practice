package Arrays_06.Basic;

import java.util.HashMap;
import java.util.Map;

public class App13_CheckIfTwoArraysAreEqualOrNot {
    public static boolean check(int[] a, int[] b) {
        Map<Integer, Integer> map = new HashMap();
        for (int num : a) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : b) {
            if (!map.containsKey(num))
                return false;

            map.put(num, map.get(num) - 1);

            if (map.get(num) == 0)
                map.remove(num);
        }
        return map.isEmpty();
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 5, 4, 0};
        int b[] = {2, 4, 5, 0, 1};

        System.out.println(check(a, b));

    }
}
