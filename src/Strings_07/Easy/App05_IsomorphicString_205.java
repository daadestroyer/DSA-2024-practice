package Strings_07.Easy;

import java.util.HashMap;

public class App05_IsomorphicString_205 {

    public static boolean isomorphicString(String s, String t) {
        HashMap<Character, Character> mapS = new HashMap<>();
        HashMap<Character, Character> mapT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            // check if there is already a mapping from s -> t
            if (mapS.containsKey(charS)) {
                // if there is a mapping ensure their value are same
                if (mapS.get(charS) != charT) {
                    return false;
                }
            } else {
                // otherwise add the new mappings into mapS
                mapS.put(charS, charT);
            }

            // check if there is already a mapping from t -> s
            if (mapT.containsKey(charT)) {
                if(mapT.get(charT) != charS){
                    return false;
                }
            }
            else{
                mapT.put(charT,charS);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "badc";
        String t = "baba";
        boolean res = isomorphicString(s, t);
        System.out.println(res);

    }
}
