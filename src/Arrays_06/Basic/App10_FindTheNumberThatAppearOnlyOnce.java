package Arrays_06.Basic;

import java.util.ArrayList;
import java.util.HashMap;

public class App10_FindTheNumberThatAppearOnlyOnce {
    static int naiveApproach(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i : arr) {
            if (map.get(i) == 1) {
                return i;
            }
        }
        return -1;
    }

    static int bruteForce(int[] arr) {
        int ans = 0;
        // XOR operation b/w 0 and any number will give result as that number
        // XOR operation b/w two same number will give zero
        for (int i : arr) {
            ans = ans ^ i;
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int arr[] = {2, 2, 1};
//        System.out.println(naiveApproach(arr)); // TC: O(1), SC: O(n)
        System.out.println(bruteForce(arr));
    }
}
