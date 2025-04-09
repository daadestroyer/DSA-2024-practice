package SlidingWindow_TwoPointer_11;

import java.util.HashMap;

public class App04_LengthOfLongestRepeatingCharacter {

    public static int optimalSolution(String s, int k) {
        int n = s.length();
        int maxLen = 0;
        int maxFreq = 0;
        int currWinSize = 0;
        int left = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int right = 0; right < n; right++) {
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            maxFreq = Math.max(maxFreq, map.get(ch));

            int changesNeedToBeMade = (right - left + 1) - maxFreq;
            if (changesNeedToBeMade <= k) {
                maxLen = Math.max(maxLen, right - left + 1);
            } else {
                map.put(ch, map.get(ch) - 1);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        System.out.println(optimalSolution(s, k));
    }
}
