package Strings_07.Medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class App02_CountNumberOfSubstringsWithKDistinctCharacters {
    static int bruteForceApproach(String s, int len, int k) {
        int res = 0;
        for (int i = 0; i < len; i++) {
            System.out.println("i = " + i);
            HashSet<Character> set = new HashSet<>();
            for (int j = i; j < len; j++) {
                set.add(s.charAt(j));
                System.out.println(set);
                if (set.size() == k) {
                    res++;
                } else if (set.size() > k) {
                    break;
                }
            }
        }
        return res;
    }

    static int optimalApproach(String s, int k) {
        int n = s.length();
        int left = 0;
        int count = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int right = 0; right < n; right++) {
            char rightChar = s.charAt(right);
            hm.put(rightChar, hm.getOrDefault(rightChar, 0) + 1);

            while(hm.size() > k) {
                char leftChar = s.charAt(left);
                hm.put(leftChar, hm.get(leftChar) - 1);
                if (hm.get(leftChar) == 0) {
                    hm.remove(leftChar);
                }
                left++;
            }
            count +=  right - left + 1;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "aba";
        int k = 2;
        //    System.out.println(bruteForceApproach(s, s.length(), k));

        int ans1 = optimalApproach(s, k);
        int ans2 = optimalApproach(s, k - 1);
        System.out.println("ans1 = " + ans1 + " ans2 = " + ans2);

    }
}
