package Strings_07.Easy;

import java.util.HashMap;

public class App05_IsomorphicString_205 {

    public static boolean isomorphicString(String s, String t) {
        HashMap<Character, Character> mapS = new HashMap<>();
        HashMap<Character, Character> mapT = new HashMap<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            if (mapS.containsKey(charS)) {
                if (mapS.get(charS) != charT) {
                    return false;
                }
            } else {
                mapS.put(charS, charT);
            }
            if (mapT.containsKey(charT)) {
                if (mapT.get(charT) != charS) {
                    return false;
                }
            } else {
                mapT.put(charT, charS);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "badc";
        String t = "baba";
        System.out.println(isomorphicString(s, t));

    }
}
