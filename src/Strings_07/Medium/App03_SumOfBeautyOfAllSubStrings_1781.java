package Strings_07.Medium;

import java.nio.MappedByteBuffer;
import java.util.HashMap;
import java.util.Map;

public class App03_SumOfBeautyOfAllSubStrings_1781 {

    private static int beautySum(String s, int length) {
        int res = 0;

        for (int i = 0; i < length; i++) {
            Map<Character, Integer> map = new HashMap<>();
            for (int j = i; j < length; j++) {
                map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);

                int minFreq = Integer.MAX_VALUE;
                int maxFreq = Integer.MIN_VALUE;

                for (int freq : map.values()) {
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
