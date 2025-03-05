package Strings_07.Medium;

import java.util.Arrays;
import java.util.HashMap;

public class App05_RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && hm.get(s.charAt(i)) < hm.get(s.charAt(i + 1))) {
                ans -= hm.get(s.charAt(i));
            } else {
                ans += hm.get(s.charAt(i));
            }

        }
        System.out.println(ans);
    }
}


