package Strings_07.Easy;

import java.util.HashMap;
import java.util.Map;

public class App09_FindFirstNonRepeatingCharacter {
    public static char nonRepeatingChar(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(int i=0 ; i<s.length() ; i++){
            if(map.get(s.charAt(i)) == 1){
                return s.charAt(i);
            }
        }
        return '$';

    }
    public static void main(String[] args) {
        System.out.println(nonRepeatingChar("geeksforgeeks"));
    }
}
