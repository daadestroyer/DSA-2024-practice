package Strings_07;

import java.util.Arrays;

public class App04_LongestCommonPrefix_14 {
    private static boolean check(String temp, String[] str) {
        for (int i = 1; i < str.length; i++) {
            if (!str[i].contains(temp)) {
                return false;
            }
        }
        return true;
    }

    public static String longestCommonPrefix(String[] str) {
        Arrays.sort(str);
        int idx = 0;
        String s1 = str[0];
        String s2 = str[str.length - 1];
        while (idx < s1.length() && idx < s2.length()) {
            if (s1.charAt(idx) == s2.charAt(idx)) {
                idx++;
            }
            else{
                break;
            }
        }
        return s1.substring(0,idx);
    }

    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};
        String s = longestCommonPrefix(str);
        System.out.println("res---> " + s);


    }


}
