package Strings_07.Easy;

import java.util.Arrays;

public class App04_LongestCommonPrefix_14 {
    public static boolean itContains(String target, String[] str) {
        boolean flag = true;
        for (String s : str) {
            if (!s.startsWith(target)) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static String bruteForce(String[] str) {
        String res = "";
        String first_string = str[0];
        int first_string_len = first_string.length();
        for (int i = 0; i < first_string_len; i++) {
            String check_str = first_string.substring(0, i + 1);
            if (itContains(check_str, str)) {
                res = first_string.substring(0, i + 1);
            }
        }
        return res;
    }

    public static String optimalApproach(String[] str) {
        Arrays.sort(str);
        String first_str = str[0];
        String last_str = str[str.length - 1];
        int idx = 0;
        while (idx < first_str.length() && idx < last_str.length()) {
            if (first_str.charAt(idx) == last_str.charAt(idx)) {
                idx++;
            } else {
                break;
            }
        }
        return first_str.substring(0,idx);
    }

    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};
        // String res = bruteForce(str);
        String res = optimalApproach(str);
        System.out.println("res = " + res);
    }
}
