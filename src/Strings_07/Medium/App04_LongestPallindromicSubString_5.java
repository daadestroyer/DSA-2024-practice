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
            for (int j = i; j < len; j++) {
                int curr_len = 0;
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


    public static void main(String[] args) {
        String s = "babad";
        System.out.println(bruteForce(s, s.length()));
    }
}
