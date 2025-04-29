package Recursion_12.Medium;

import java.util.ArrayList;
import java.util.List;

/*
Given a string s, partition s such that every substring of the partition is a palindrome.
Return all possible palindrome partitioning of s.

Input: s = "aab"
Output: [["a","a","b"],["aa","b"]]
 */
public class App12_PalindromePartitioning_131 {
    public static void main(String[] args) {
        String s = "aab";
        List<List<String>> res = new ArrayList<>();
        List<String> cres = new ArrayList<>();
        findPartition(res, cres, s, 0);
        System.out.println(res);
    }

    private static void findPartition(List<List<String>> res, List<String> cres, String s, int start) {
        if (start == s.length()) {
            res.add(new ArrayList<>(cres));
            return;
        }
        for (int i = start; i < s.length(); i++) {
            if (isPalindrome(s, start, i)) {
                cres.add(s.substring(start, i + 1));
                findPartition(res, cres, s, i + 1);
                cres.remove(cres.size() - 1);
            }
        }
    }

    private static boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start++) != s.charAt(end--)) {
                return false;
            }
        }
        return true;
    }
}
