package Strings_07.Medium;

import java.util.HashMap;
import java.util.HashSet;

public class App02_CountNumberOfSubstringsWithKDistinctCharacters_GFG {
    static int bruteForceApproach(String s, int len, int k) {
        // TC : O(N^) * O(N) = O(N) cube
        // SC : O(N)
        int res = 0;
        for (int i = 0; i < len; i++) {

            HashSet<Character> set = new HashSet<>();
            for (int j = i; j < len; j++) {
                set.add(s.charAt(j));
                System.out.println(set);
                if (set.size() == k) {
                    res++;
                } else if (set.size() > k) {
                    // we are breaking it because it we keep on adding then there is
                    // no use because we want substring which have exactly k distinct character
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

            while (hm.size() > k) {
                char leftChar = s.charAt(left);
                hm.put(leftChar, hm.get(leftChar) - 1);
                if (hm.get(leftChar) == 0) {
                    hm.remove(leftChar);
                }
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "abcd";
        int k = 2;
//            System.out.println(bruteForceApproach(s, s.length(), k));

        int ans1 = optimalApproach(s, k);
        int ans2 = optimalApproach(s, k - 1);

        // count with exactly k = count with at most k - count with most k-1
        System.out.println("ans1 = " + ans1 + " ans2 = " + ans2);

    }
}
