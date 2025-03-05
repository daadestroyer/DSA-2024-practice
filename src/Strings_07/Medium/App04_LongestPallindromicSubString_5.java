package Strings_07.Medium;

public class App04_LongestPallindromicSubString_5 {
    static boolean checkPallindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    static String bruteForce(String s, int len) {
        String ans = "";
        int maxLen = 0;
        for (int i = 0; i < len; i++) {
            int curr_len = 0;
            for (int j = i; j < len; j++) {

                if (checkPallindrome(s, i, j)) {
                    curr_len = j - i + 1;

                    if (curr_len > maxLen) {
                        maxLen = curr_len;
                        ans = s.substring(i, j + 1);
                    }
                }
            }
        }
        return ans;
    }

    public static String optimalApproach(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        int len = s.length();
        int start = 0;
        int end = 0;
        int maxLen = 0;
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            int left = i;
            int right = i;
            while (left >= 0 && s.charAt(left) == c) {
                left--;
            }
            while (right < len && s.charAt(right) == c) {
                right++;
            }
            while (left >= 0 && right < len) {
                if (s.charAt(left) != s.charAt(right)) {
                    break;
                }
                left--;
                right++;
            }
            int newLen = right - left - 1; // because  in upper while loop we are making one left-- extra
            if (newLen > maxLen) {
                start = left +1;
                maxLen = newLen;
            }
        }
        return s.substring(start,start+maxLen);
    }


    public static void main(String[] args) {
        String s = "babad";
        // System.out.println(bruteForce(s, s.length()));
        System.out.println(optimalApproach(s));
    }
}
