package Strings_07.Medium;

import java.util.*;
import java.util.stream.Collectors;

public class App01_SortCharactersByFrequency_451 {
    public static String frequencySort(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char c : s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        hm = hm
                .entrySet()
                .stream()
                .sorted((e1,e2)->e2.getValue()-e1.getValue())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e2,LinkedHashMap::new));

        StringBuffer sb = new StringBuffer();
        for(Map.Entry<Character,Integer> entry : hm.entrySet()){
            char key = entry.getKey();
            int val = entry.getValue();
            for(int i=0 ; i<val;i++){
                sb.append(key);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }
}
