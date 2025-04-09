package SlidingWindow_TwoPointer_11;

import java.util.HashSet;
import java.util.Set;

public class App01_LongestSubstringWithoutRepeatingCharacters_3 {
    public static boolean checkRep(int i, int j, String s) {
        Set<Character> set = new HashSet<>();
        for (int k = i; k <= j; k++) {
            if (set.contains(s.charAt(k))) {
                return false; // Found a duplicate
            }
            set.add(s.charAt(k));
        }
        return true; // No duplicates
    }
    public static int bruteForce(String s){
        int n = s.length();
        int len = 0;
        for(int i=0 ; i <n ; i++){
            for(int j=i ; j<n ; j++){
                if(checkRep(i,j,s)){
                    len = Math.max(len , j - i +1);
                }
            }
        }
        return len;
    }
    public static int optimalApproach(String s){
        int n = s.length();
        Set<Character> st = new HashSet<>();
        int left = 0;
        int maxLen = 0;
        for(int right = 0 ; right < n ; right++){
            while(st.contains(s.charAt(right))){
                st.remove(s.charAt(left));
                left++;
            }
            st.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        // System.out.println(bruteForce(s));
        System.out.println(optimalApproach(s));
    }
}
