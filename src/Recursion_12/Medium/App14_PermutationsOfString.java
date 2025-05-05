package Recursion_12.Medium;

import java.util.ArrayList;
import java.util.List;

public class App14_PermutationsOfString {
    public static void main(String[] args) {
        String s = "abc";
        List<String> res = new ArrayList<>();
        boolean[] visited = new boolean[s.length()];
        StringBuffer current = new StringBuffer();
        getPermutation(res, visited, s, current);
        System.out.println(res);
    }

    private static void getPermutation(List<String> res, boolean[] visited, String s, StringBuffer current) {
        if (current.length() == s.length()) {
            res.add(current.toString());
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                current.append(s.charAt(i));
                getPermutation(res, visited, s, current);
                current.deleteCharAt(current.length() - 1);
                visited[i] = false;
            }
        }
    }
}
