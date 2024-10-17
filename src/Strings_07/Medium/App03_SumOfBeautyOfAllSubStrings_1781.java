package Strings_07.Medium;

import java.util.HashMap;

public class App03_SumOfBeautyOfAllSubStrings_1781 {
    public static int beautySum(String s, int len) {
        int res = 0;

        for (int i = 0; i < len; i++) {
            HashMap<Character, Integer> hm = new HashMap<>();

            for (int j = i; j < len; j++) {
                char current_char = s.charAt(j);
                hm.put(current_char, hm.getOrDefault(current_char, 0) + 1);

                int minFreq = Integer.MAX_VALUE;
                int maxFreq = Integer.MIN_VALUE;
                for (int freq : hm.values()) {
                    minFreq = Math.min(minFreq, freq);
                    maxFreq = Math.max(maxFreq, freq);
                }
                res += maxFreq - minFreq;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "aabcbaa";
        System.out.println(beautySum(s, s.length()));
    }
}
