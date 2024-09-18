package Strings_07.Easy;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class App02_ReverseWordsInAString_151 {
    public static void main(String[] args) {
        String s = "a good   example";
        String[] str = s.trim().split("\\s+"); // --> \\s means skipping one white space
        // --> \\s+ means skipping all white space after any word
        List<String> lst = Arrays.asList(str);
        Collections.reverse(lst);
        String res = String.join(" ", lst); // here join method means we are return string with some space
        // after each work from the given data structure

        System.out.println(res);
    }
}
