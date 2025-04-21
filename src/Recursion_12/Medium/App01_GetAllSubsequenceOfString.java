package Recursion_12.Medium;

import java.util.ArrayList;
import java.util.List;

public class App01_GetAllSubsequenceOfString {
    public static List<String> getAllSubSeq(String str) {
        if (str.length() == 0) {
            ArrayList<String> base_case = new ArrayList<>();
            base_case.add("");
            return base_case;
        }
        char curr_char = str.charAt(0);
        String rest_of_String = str.substring(1);
        List<String> rec_res = getAllSubSeq(rest_of_String);
        ArrayList<String> res = new ArrayList<>();
        for (String s : rec_res) {
            res.add(s);
            res.add(s + curr_char);
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "aba";
        List<String> allSubSeq = getAllSubSeq(str);
        System.out.println(allSubSeq);
    }
}
