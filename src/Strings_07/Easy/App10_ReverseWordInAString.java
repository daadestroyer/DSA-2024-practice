package Strings_07.Easy;

import java.util.ArrayList;
import java.util.List;

public class App10_ReverseWordInAString {
    public static String reverseWord(String s) {
        String[] arr = s.split("\\.");
        StringBuilder sb = new StringBuilder();

        List<String> list = new ArrayList<>();
        for (String str : arr) {
            if (!str.isEmpty()) {
                list.add(str);
            }
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            sb.append(list.get(i));
            if (i != 0) {
                sb.append(".");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "..geeks..for.geeks.";

        System.out.println(reverseWord(s));
    }
}
